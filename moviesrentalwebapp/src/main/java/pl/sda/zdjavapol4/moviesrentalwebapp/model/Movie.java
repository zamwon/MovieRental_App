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

    @Enumerated
    private Genre genre;
    private LocalDate releaseDate;
    private String description;

    @OneToMany(mappedBy = "movie")
    private List<Review> reviews;

    @OneToMany(orphanRemoval = true,
    cascade = CascadeType.ALL,
    fetch = FetchType.EAGER,
    mappedBy = "movie")
    private List<MovieCopy> copies;

    // zmienic na int(ile mamy dostepnych filmow)
    // , jezli liczba filmow odjac zmienna
    // 'ileCheZamowic' jest wieksza od zera ->
    // spoko mozna wypozyczyc, w innym przypadku
    // wyswietl informacje ze dostepne sa tylko
    // "liczba wprowadzona minus wynik z
    // (liczba dostepnych minus ile chce wypozyczyc)"

}
