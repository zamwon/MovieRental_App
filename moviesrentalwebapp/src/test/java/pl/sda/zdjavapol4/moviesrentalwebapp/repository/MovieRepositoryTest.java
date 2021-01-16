package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Movie;

import java.time.LocalDate;
import java.util.Optional;

@DataJpaTest
public class MovieRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void saves_and_loads_movie() {
        //given
        String title = "Ogniem i Mieczem";

        Movie m1 = new Movie();
        m1.setTitle(title);
        m1.setReleaseDate(LocalDate.of(1999, 2, 11));

        Optional<Movie> foundMovieOptional = movieRepository.findByTitle(title);
        Assertions.assertThat(foundMovieOptional.isEmpty()).isTrue();

        //when
        movieRepository.save(m1);
        foundMovieOptional = movieRepository.findByTitle(title);

        //then
        Assertions.assertThat(foundMovieOptional.isPresent()).isTrue();
        Movie foundMovie = foundMovieOptional.get();
        Assertions.assertThat(foundMovie.getTitle()).isEqualTo(m1.getTitle());
        Assertions.assertThat(foundMovie.getReleaseDate()).isEqualTo(m1.getReleaseDate());
    }

}
