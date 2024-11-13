package org.example.gerenciadorfilmes.Repositories;

import org.example.gerenciadorfilmes.Entities.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MovieRepository extends MongoRepository<Movie, String> {

    @Query("{ '$or': [ { 'title': { $regex: ?0, $options: 'i' } }, { 'cast': { $regex: ?0, $options: 'i' } }, { 'extract': { $regex: ?0, $options: 'i' } } ] }")
    List<Movie> searchByKeyword(String keyword);
}