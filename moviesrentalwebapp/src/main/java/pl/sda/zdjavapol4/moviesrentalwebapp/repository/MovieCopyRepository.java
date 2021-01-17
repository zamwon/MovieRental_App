package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.MovieCopy;

import java.util.List;

@Repository

public interface MovieCopyRepository  extends CrudRepository<MovieCopy, Long> {

    List<MovieCopy> findAllByMovie(Movie movie);
    List<MovieCopy> findAll();
}
