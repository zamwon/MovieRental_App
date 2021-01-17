package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Genre;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Movie;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    Optional<Movie> findByTitle(String title);

    List<Movie> findAllByGenre(Genre genre);

    List<Movie> findByReleaseDate(LocalDate releaseDate);

}
