package pl.sda.zdjavapol4.moviesrentalwebapp.exception;

public class MovieDoesNotExistInCatalogueException extends Exception {

    public MovieDoesNotExistInCatalogueException(String title) {
        super(title + "does not exist in catalogue");
    }
}
