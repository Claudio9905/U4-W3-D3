package claudiopostiglione.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
public class PartitaDiCalcio extends Evento {

    private String squadraDiCasa;
    private String squadraOspite;
    private String squadraVincente;
    private int numGolSquadraVincente;
    private int numGolSquadraOspite;

    //Costruttori
    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(String titolo, LocalDate data_evento, String descrizione, TipologiaEvento type, int numero_max_partecipanti, String squadraDiCasa, String squadraOspite, String squadraVincente, int numGolSquadraVincente, int numGolSquadraOspite, Location location) {
        super(titolo, data_evento, descrizione, type, numero_max_partecipanti, location);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.numGolSquadraVincente = numGolSquadraVincente;
        this.numGolSquadraOspite = numGolSquadraOspite;
    }

    //Metodi
    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getNumGolSquadraVincente() {
        return numGolSquadraVincente;
    }

    public void setNumGolSquadraVincente(int numGolSquadraVincente) {
        this.numGolSquadraVincente = numGolSquadraVincente;
    }

    public int getNumGolSquadraOspite() {
        return numGolSquadraOspite;
    }

    public void setNumGolSquadraOspite(int numGolSquadraOspite) {
        this.numGolSquadraOspite = numGolSquadraOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", numGolSquadraVincente=" + numGolSquadraVincente +
                ", numGolSquadraOspite=" + numGolSquadraOspite +
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
