package pl.sda.zdjavapol4.moviesrentalwebapp.service.impl;

import pl.sda.zdjavapol4.moviesrentalwebapp.model.MovieCopy;
import pl.sda.zdjavapol4.moviesrentalwebapp.repository.MovieCopyRepository;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.CopyService;

import java.util.List;

public class CopyServiceImpl implements CopyService {

    private MovieCopyRepository movieCopyRepository;
    @Override
    public void save(MovieCopy copy) {
        movieCopyRepository.save(copy);
    }

    @Override
    public MovieCopy getById(Long id) {
        return movieCopyRepository.findById(id).orElse(null);
    }

    @Override
    public List<MovieCopy> getAll() {
        return movieCopyRepository.findAll();
    }

    @Override
    public void update(MovieCopy copy) {
        movieCopyRepository.save(copy);
    }

    @Override
    public void delete(MovieCopy copy) {
        movieCopyRepository.delete(copy);
    }
}
