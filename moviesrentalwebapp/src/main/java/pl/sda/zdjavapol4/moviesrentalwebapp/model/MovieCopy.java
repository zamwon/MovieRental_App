package pl.sda.zdjavapol4.moviesrentalwebapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class MovieCopy {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Order order;

}
