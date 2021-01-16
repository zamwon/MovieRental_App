package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Customer;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Order;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.OrderStatus;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

    Optional<Order> findById(Long id);

    Optional<Order> findByCustomer(Customer customer);

    Optional<Order> findByOrderStatus(OrderStatus orderStatus);

    Optional<Order> findByDeliveryDate(LocalDate deliveryDate);

    Optional<Order> findByReturnDate(LocalDate returnDate);
}
