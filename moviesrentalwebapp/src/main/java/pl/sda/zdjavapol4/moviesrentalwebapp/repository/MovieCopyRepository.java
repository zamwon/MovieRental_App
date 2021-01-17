package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Copy;

import java.util.List;

@Repository

public interface MovieCopyRepository  extends CrudRepository<Copy, Long> {

    List<Copy> findAllByMovie(Movie movie);
    List<Copy> findAll();
}
