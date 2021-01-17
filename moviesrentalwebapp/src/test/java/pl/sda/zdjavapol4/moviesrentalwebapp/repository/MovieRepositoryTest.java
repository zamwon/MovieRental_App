package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.CopyStatus;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Genre;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Copy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@DataJpaTest
public class MovieRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private MovieCopyRepository copyRepository;

    // 1
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

        // 2
    }

    @Test
    public void finds_movieByGenre () {

        //given
        Genre gatunekFilmu2 = Genre.COMEDY;
        String title2 = "My programisci XD";

        Movie m2 = new Movie();
        m2.setTitle(title2);
        m2.setReleaseDate(LocalDate.of(1999, 2, 11));
        m2.setGenre(gatunekFilmu2);

        List<Movie> foundMoviesList = movieRepository.findAllByGenre(gatunekFilmu2);
        Assertions.assertThat(foundMoviesList.isEmpty()).isTrue();

        //when
        movieRepository.save(m2);
        foundMoviesList = movieRepository.findAllByGenre(gatunekFilmu2);

        //then

        Assertions.assertThat(foundMoviesList.isEmpty()).isFalse();
        Assertions.assertThat(foundMoviesList.size()).isEqualTo(1);

        Movie foundMovie = foundMoviesList.get(0);
        //not null
        //cheak fields

        Assertions.assertThat(foundMovie).isNotNull();

        Assertions.assertThat(foundMovie.getTitle()).isEqualTo(title2);
        Assertions.assertThat(foundMovie.getGenre()).isEqualTo(gatunekFilmu2);
    }

    //3

    @Test
    public void saves_movie_and_related_copies() {
        //given
        String title = "Avatar";

        Movie m1 = new Movie();
        m1.setTitle(title);
        m1.setReleaseDate(LocalDate.of(1999, 2, 11));

        //create related copies
        Copy c1 = new Copy();
        c1.setStatus(CopyStatus.AVAILABLE);
        c1.setMovie(m1);
        Copy c2 = new Copy();
        c2.setMovie(m1);
        c2.setStatus(CopyStatus.RENTED);

        List<Copy> copies = new ArrayList<>();
        copies.add(c1);
        copies.add(c2);
        //add copies list to movie
        m1.setCopies(copies);

        Optional<Movie> foundMovieOptional = movieRepository.findByTitle(title);
        Assertions.assertThat(foundMovieOptional.isEmpty()).isTrue();

        //when
        movieRepository.save(m1);
        foundMovieOptional = movieRepository.findByTitle(title);
        Assertions.assertThat(foundMovieOptional.isPresent()).isTrue();
        Movie foundMovie = foundMovieOptional.get();

        List<Copy> foundCopies = copyRepository.findAll();

        //then
        Assertions.assertThat(foundMovie.getTitle()).isEqualTo(m1.getTitle());
        Assertions.assertThat(foundMovie.getReleaseDate()).isEqualTo(m1.getReleaseDate());

        Assertions.assertThat(foundCopies.isEmpty()).isFalse();
    }

}
