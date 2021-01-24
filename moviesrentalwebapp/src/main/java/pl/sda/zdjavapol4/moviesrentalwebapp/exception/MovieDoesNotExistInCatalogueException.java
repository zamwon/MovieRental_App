package pl.sda.zdjavapol4.moviesrentalwebapp.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MovieDoesNotExistInCatalogueException extends Exception {

    public MovieDoesNotExistInCatalogueException(String title) {
        super(title + "does not exist in catalogue");
    }
}
