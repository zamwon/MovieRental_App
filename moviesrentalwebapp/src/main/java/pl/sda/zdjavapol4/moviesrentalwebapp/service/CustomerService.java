package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import pl.sda.zdjavapol4.moviesrentalwebapp.model.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);

    void update(Customer user);

    void delete(Long id);

    void delete(Customer customer);

    List<Customer> getAll();

    Customer getById(Long id);

    Customer findByEmail(String email);

    Customer findByPhoneNumber(String phoneNumber);

}
