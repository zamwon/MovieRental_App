package pl.sda.zdjavapol4.moviesrentalwebapp.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MovieAlreadyExistInCatalogueException extends Exception{

    public MovieAlreadyExistInCatalogueException(String title) {
        super(title + "Already exists in catalogue");
    }
}
