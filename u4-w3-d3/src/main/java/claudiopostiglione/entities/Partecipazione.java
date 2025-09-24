package claudiopostiglione.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Partecipazione")
public class Partecipazione {

    @Id
    @GeneratedValue
    @Column(name = "id_partecipazione")
    private UUID id_partecipazione;
    private Stato stato;

    //Costruttori
    public Partecipazione(){};

    public Partecipazione(Stato stato){
        this.stato = stato;
    }

    //Metodi

    public UUID getId_partecipazione() {
        return id_partecipazione;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id_partecipazione=" + id_partecipazione +
                ", stato=" + stato +
                '}';
    }
}
