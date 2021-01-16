package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Customer;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Order;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.OrderStatus;

import java.time.LocalDate;
import java.util.Optional;

public interface OrderRepository extends CrudRepository<Order, Long> {

    Optional<Order> findByID(Long id);

    Optional<Order> findByCustomer(Customer customer);

    Optional<Order> findByOrderStatus(OrderStatus orderStatus);

    Optional<Order> findByDeliveryDate(LocalDate deliveryDate);

    Optional<Order> findByReturnDate(LocalDate returnDate);
}
