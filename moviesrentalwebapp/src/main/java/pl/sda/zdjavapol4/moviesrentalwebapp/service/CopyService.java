package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import pl.sda.zdjavapol4.moviesrentalwebapp.model.MovieCopy;

import java.util.List;

public interface CopyService {
  //api
    public void save(MovieCopy copy);

    public MovieCopy getById(Long id);

    public List<MovieCopy> getAll();

    public void update(MovieCopy copy);

    public void delete(MovieCopy copy);
}

// implementacja service
// przypadki uzycia