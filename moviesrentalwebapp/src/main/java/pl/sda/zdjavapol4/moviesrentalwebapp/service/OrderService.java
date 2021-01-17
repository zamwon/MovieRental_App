package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import pl.sda.zdjavapol4.moviesrentalwebapp.model.Order;

import java.util.List;

public interface OrderService {

    void save(Order order);

    Order getById(Long id);

    List<Order> getAll();

    void update(Order order);

    void delete(Long id);
}
