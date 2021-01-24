package pl.sda.zdjavapol4.moviesrentalwebapp.catalogue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.zdjavapol4.moviesrentalwebapp.exception.MovieDoesNotExistInCatalogueException;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.repository.MovieRepository;

@Component
@RequiredArgsConstructor
public class ReadMovieFromCatalogue {

    private MovieRepository movieRepository;

    public Movie readByTitle(String title) throws Exception{
        return movieRepository.findByTitle(title)
                .orElseThrow(MovieDoesNotExistInCatalogueException::new);
    }
}
