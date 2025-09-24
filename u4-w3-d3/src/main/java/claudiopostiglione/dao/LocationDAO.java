package claudiopostiglione.dao;

import claudiopostiglione.entities.Evento;
import claudiopostiglione.entities.Location;
import claudiopostiglione.exceptions.idNotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class LocationDAO {

    private final EntityManager entityManager;

    public LocationDAO(EntityManager entityManager){ this.entityManager = entityManager;}


    public void save(Location newLocation){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newLocation);
        transaction.commit();
        System.out.println("La location " + newLocation + " è stato aggiunta!");
    }

    public Location findById(String idLocation){
        Location found = entityManager.find(Location.class, UUID.fromString(idLocation));
        if(found == null) throw new idNotFoundException(idLocation);
        return found;
    }
}
