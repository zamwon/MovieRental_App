package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import pl.sda.zdjavapol4.moviesrentalwebapp.model.Review;

import java.util.List;

public interface ReviewService {

    void save(Review review);

    Review getById(Long id);

    List<Review> getAll();

    void update(Review opinion);

    void delete(Long id);
}
