package org.example.gerenciadorfilmes.Controllers;

import org.example.gerenciadorfilmes.Entities.Movie;
import org.example.gerenciadorfilmes.Services.MovieService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping("/search")
    public List<Movie> searchMovies(@RequestParam String keyword) {
        return service.searchMovies(keyword);
    }
}
