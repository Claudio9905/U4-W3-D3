package claudiopostiglione.dao;

import claudiopostiglione.entities.Concerto;
import claudiopostiglione.entities.Evento;
import claudiopostiglione.entities.GaraDiAtletica;
import claudiopostiglione.entities.PartitaDiCalcio;
import claudiopostiglione.exceptions.idNotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.util.List;
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

    public Concerto findConcertoById(String idConcerto){
        Concerto found = entityManager.find(Concerto.class, idConcerto);
        if(found == null) throw new idNotFoundException(idConcerto);
        return found;
    }

    public GaraDiAtletica findGaraDiAtleticaById(String idGaraDiAtletica){
        GaraDiAtletica found = entityManager.find(GaraDiAtletica.class, idGaraDiAtletica);
        if(found == null) throw new idNotFoundException(idGaraDiAtletica);
        return found;
    }

    public PartitaDiCalcio findPartitaDiCalcioById(String idPartitaDiCalcio){
        PartitaDiCalcio found = entityManager.find(PartitaDiCalcio.class, idPartitaDiCalcio);
        if(found == null) throw new idNotFoundException(idPartitaDiCalcio);
        return found;
    }

    public List<Concerto> getConcertiInStreaming(){
        TypedQuery<Concerto> query = entityManager.createQuery("SELECT c FROM Concerto c", Concerto.class);
        return query.getResultList();
    }

    public List<Concerto> getConcertiPerGenere(){
        TypedQuery<Concerto> query = entityManager.createQuery("SELECT c FROM Concerto c GROUP BY c.genere", Concerto.class);
        return  query.getResultList();
    }

    

}
