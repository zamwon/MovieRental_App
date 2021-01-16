package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Review;

import java.util.Optional;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

    Optional<Review> findByMovie(Movie movie);

    // ? ->   Optional<Review> findAll();

}
