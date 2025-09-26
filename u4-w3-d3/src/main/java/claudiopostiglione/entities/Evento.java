package claudiopostiglione.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Evento")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Evento {

    @Id
    @GeneratedValue
    @Column(name = "id_evento")
    protected UUID id_evento;
    protected String titolo;
    protected LocalDate data_evento;
    protected String descrizione;
    protected TipologiaEvento type;
    protected int numero_max_partecipanti;


    @ManyToOne
    @JoinColumn(name = "id_location", nullable = false)
    protected Location location;

    @OneToMany(mappedBy = "evento")
    List<Partecipazione> partecipazioni;

    //Costruttori
    public Evento(){}

    public Evento(String titolo, LocalDate data_evento, String descrizione, TipologiaEvento type, int numero_max_partecipanti, Location location){
        this.titolo = titolo;
        this.data_evento = data_evento;
        this.descrizione = descrizione;
        this.type = type;
        this.numero_max_partecipanti = numero_max_partecipanti;
        this.location = location;
    }

    //Metodi
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public UUID getId_evento() {
        return id_evento;
    }


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public void setData_evento(LocalDate data_evento) {
        this.data_evento = data_evento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipologiaEvento getType() {
        return type;
    }

    public void setType(TipologiaEvento type) {
        this.type = type;
    }

    public int getNumero_max_partecipanti() {
        return numero_max_partecipanti;
    }

    public void setNumero_max_partecipanti(int numero_max_partecipanti) {
        this.numero_max_partecipanti = numero_max_partecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id_evento=" + id_evento +
                ", titolo='" + titolo + '\'' +
                ", data_evento=" + data_evento +
                ", descrizione='" + descrizione + '\'' +
                ", type=" + type +
                ", numero_max_partecipanti=" + numero_max_partecipanti +
                ", location=" + location +
                ", partecipazioni=" + partecipazioni +
                '}';
    }
}
