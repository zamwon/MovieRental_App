package pl.sda.zdjavapol4.moviesrentalwebapp.service.impl;

import org.springframework.stereotype.Service;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Customer;
import pl.sda.zdjavapol4.moviesrentalwebapp.repository.CustomerRepository;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.CustomerService;

import java.util.ArrayList;
import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;


    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.findById(customer.getId());
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    @Override
    public Customer getById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer findByEmail(String email) {
        return null;
    }

    @Override
    public Customer findByPhoneNumber(String phoneNumber) {
        return null;
    }
}
