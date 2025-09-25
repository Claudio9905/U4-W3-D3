package claudiopostiglione.entities;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class GaraDiAtletica extends Evento {
    private Set<Persona> atleti;
    private Persona vincitore;

    //Costruttori
    public GaraDiAtletica() {
    }

    public GaraDiAtletica(String titolo, LocalDate data_evento, String descrizione, TipologiaEvento type, int numero_max_partecipanti, Location location, Set<Persona> atleti, Persona vincitore) {
        super(titolo, data_evento, descrizione, type, numero_max_partecipanti, location);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    //Metodi
    public Set<Persona> getAtleti() {
        return atleti;
    }

    public void setAtleti(Set<Persona> atleti) {
        this.atleti = atleti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "atleti=" + atleti +
                ", vincitore=" + vincitore +
                ", id_evento=" + id_evento +
                ", titolo='" + titolo + '\'' +
                ", data_evento=" + data_evento +
                ", descrizione='" + descrizione + '\'' +
                ", type=" + type +
                ", numero_max_partecipanti=" + numero_max_partecipanti +
                ", location=" + location +
                '}';
    }
}
