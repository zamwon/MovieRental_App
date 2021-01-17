package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class MovieCopyRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private MovieCopyRepository copyRepository;
}
