package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import pl.sda.zdjavapol4.moviesrentalwebapp.model.Genre;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Movie;

import java.util.List;
import java.util.Set;


public interface MovieService {
    void save(Movie movie);

    Movie getById(Long id);

    List<Movie> getAll();

    void update(Movie movie);

    void delete(Long id);

    Movie findByTitle(String Title);

    Movie findByDirector(String director);

    Movie findByGenre(Genre genre);

    Set<Movie> findAllByGenre(Genre genre);

}
