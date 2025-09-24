package claudiopostiglione.dao;

import claudiopostiglione.entities.Evento;
import claudiopostiglione.entities.Persona;
import claudiopostiglione.exceptions.idNotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class PersonaDAO {

    private final EntityManager entityManager;

    public PersonaDAO(EntityManager entityManager){ this.entityManager = entityManager;}


    public void save(Persona newPersona){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newPersona);
        transaction.commit();
        System.out.println("La persona " + newPersona + " è stato aggiunta!");
    }

    public Persona findById(String idPersona){
        Persona found = entityManager.find(Persona.class, UUID.fromString(idPersona));
        if(found == null) throw new idNotFoundException(idPersona);
        return found;
    }


}
