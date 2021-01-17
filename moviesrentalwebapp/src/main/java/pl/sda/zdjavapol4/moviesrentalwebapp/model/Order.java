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
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    Customer customer;

    OrderStatus orderStatus;
    LocalDate deliveryDate;
    LocalDate returnDate;

    @OneToMany(mappedBy = "order")
    List<Copy> copies;

}
