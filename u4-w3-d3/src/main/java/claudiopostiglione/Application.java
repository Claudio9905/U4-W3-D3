package claudiopostiglione;

import claudiopostiglione.dao.EventoDAO;
import claudiopostiglione.dao.LocationDAO;
import claudiopostiglione.dao.PartecipazioneDAO;
import claudiopostiglione.dao.PersonaDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneEventi2");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        EventoDAO ed = new EventoDAO(em);
        PersonaDAO pd = new PersonaDAO(em);
        PartecipazioneDAO pad = new PartecipazioneDAO(em);
        LocationDAO ld = new LocationDAO(em);


        System.out.println("Connessione al database avvenuta con successo!");


        em.close();
        emf.close();

    }
}
