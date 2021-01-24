package pl.sda.zdjavapol4.moviesrentalwebapp.exception;

public class MovieAlreadyExistInCatalogueException extends Exception{

    public MovieAlreadyExistInCatalogueException(String title) {
        super(title + "Already exists in catalogue");
    }
}
