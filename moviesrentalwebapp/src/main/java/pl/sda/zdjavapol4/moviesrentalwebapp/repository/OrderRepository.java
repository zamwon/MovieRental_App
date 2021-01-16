package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Customer;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Order;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.OrderStatus;

import java.time.LocalDate;
import java.util.Optional;

public interface OrderRepository extends CrudRepository<Order, Long> {

    Optional<Movie> findByID(Long id);

    Optional<Movie> findByCustomer(Customer customer);

    Optional<Movie> findByOrderStatus(OrderStatus orderStatus);

    Optional<Movie> findByDeliveryDate(LocalDate deliveryDate);

    Optional<Movie> findByReturnDate(LocalDate returnDate);
}
