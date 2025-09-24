package claudiopostiglione.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @GeneratedValue
    @Column(name = "id_persona")
    private UUID id_persona;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate data_di_nascita;
    private SessoPersona sesso;

    //Costruttori
    public Persona(){}

    public Persona(String nome, String cognome, String email, LocalDate data_di_nascita, SessoPersona sesso){
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.data_di_nascita = data_di_nascita;
        this.sesso = sesso;
    }

    //Metodi
    public UUID getId_persona() {
        return id_persona;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getData_di_nascita() {
        return data_di_nascita;
    }

    public void setData_di_nascita(LocalDate data_di_nascita) {
        this.data_di_nascita = data_di_nascita;
    }

    public SessoPersona getSesso() {
        return sesso;
    }

    public void setSesso(SessoPersona sesso) {
        this.sesso = sesso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id_persona=" + id_persona +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", data_di_nascita=" + data_di_nascita +
                ", sesso=" + sesso +
                '}';
    }
}
