package claudiopostiglione.exceptions;

public class idNotFoundException extends RuntimeException {
    public idNotFoundException(String id) {
        super("Il record con id " + id + " non è stato trovato");
    }
}
