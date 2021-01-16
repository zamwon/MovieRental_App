package pl.sda.zdjavapol4.moviesrentalwebapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private Genre genre;
    private LocalDate releaseDate;
    private String description;

    @OneToMany(mappedBy = "movie")
    private List<Review> reviews;

    @OneToMany(mappedBy = "movie")
    private List<MovieCopy> copies;

}
