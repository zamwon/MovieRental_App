package pl.sda.zdjavapol4.moviesrentalwebapp.catalogue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.zdjavapol4.moviesrentalwebapp.exception.MovieAlreadyExistInCatalogueException;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.repository.MovieRepository;

@Component
@RequiredArgsConstructor
public class AddMovieToCatalogue {

    private MovieRepository movieRepository;

    public Movie add(Movie movie) throws MovieAlreadyExistInCatalogueException {

        if (movieRepository.findByTitle(movie.getTitle()).isPresent()) {
            throw new MovieAlreadyExistInCatalogueException(movie.getTitle());
        }

        return movieRepository.save(movie);
    }
}
