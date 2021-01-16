package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Customer;

import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {


    Optional<Customer> findByEmail(String email);

    Optional<Customer> findByCity(String city);

    Optional<Customer> findByStreet(String street);

    Optional<Customer> findByAddress(String city, String street);

    Optional<Customer> findByPhoneNumber(String phoneNumber);

}
