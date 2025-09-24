package claudiopostiglione.dao;

import claudiopostiglione.entities.Evento;
import claudiopostiglione.exceptions.idNotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class EventoDAO {

    private final EntityManager entityManager;

    public EventoDAO(EntityManager entityManager){ this.entityManager = entityManager;}


    public void save(Evento newEvento){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newEvento);
        transaction.commit();
        System.out.println("L'evento " + newEvento + " è stato aggiunto!");
    }

    public Evento findById(String idEvento){
        Evento found = entityManager.find(Evento.class, UUID.fromString(idEvento));
        if(found == null) throw new idNotFoundException(idEvento);
        return found;
    }

}
