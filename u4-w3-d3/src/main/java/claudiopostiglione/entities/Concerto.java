package claudiopostiglione.entities;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Concerto extends Evento {
    private Genere genere;
    private boolean inStreaming;

    //Costruttori
    public Concerto() {
    }

    public Concerto(String titolo, LocalDate data_evento, String descrizione, TipologiaEvento type, int numero_max_partecipanti, Location location, Genere genere, boolean inStreaming) {
        super(titolo, data_evento, descrizione, type, numero_max_partecipanti, location);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    //Metodi

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", inStreaming=" + inStreaming +
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
