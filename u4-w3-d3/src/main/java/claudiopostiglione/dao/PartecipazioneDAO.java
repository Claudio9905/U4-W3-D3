package claudiopostiglione.dao;

import claudiopostiglione.entities.Evento;
import claudiopostiglione.entities.Partecipazione;
import claudiopostiglione.exceptions.idNotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class PartecipazioneDAO {

    private final EntityManager entityManager;

    public PartecipazioneDAO(EntityManager entityManager){ this.entityManager = entityManager;}


    public void save(Partecipazione newPartecipazione){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newPartecipazione);
        transaction.commit();
        System.out.println("L'evento " + newPartecipazione + " è stato aggiunto!");
    }

    public Partecipazione findById(String idPartecipazione){
        Partecipazione found = entityManager.find(Partecipazione.class, UUID.fromString(idPartecipazione));
        if(found == null) throw new idNotFoundException(idPartecipazione);
        return found;
    }
}
