package claudiopostiglione.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Location")
public class Location {

    @Id
    @GeneratedValue
    @Column(name = "id_Location")
    private UUID id_Location;
    private String nome;
    private String città;


    @OneToMany(mappedBy = "location")
    private List<Evento> eventi = new ArrayList<>();



    //Costruttori

    public Location(){};

    public Location(String nome, String città){
        this.nome = nome;
        this.città = città;
    }

    //Metodi


    public List<Evento> getEventi() {
        return eventi;
    }

    public void setEventi(List<Evento> eventi) {
        this.eventi = eventi;
    }

    public UUID getId_Location() {
        return id_Location;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id_Location=" + id_Location +
                ", nome='" + nome + '\'' +
                ", città='" + città + '\'' +
                ", eventi=" + eventi +
                '}';
    }
}
