package org.example.gerenciadorfilmes.Services;

import org.example.gerenciadorfilmes.Entities.Movie;
import org.example.gerenciadorfilmes.Repositories.MovieRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> searchMovies(String keyword) {
        return repository.searchByKeyword(keyword);
    }
}
