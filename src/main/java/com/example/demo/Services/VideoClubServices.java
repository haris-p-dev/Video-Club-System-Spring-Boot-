package com.example.demo.Services;

import com.example.demo.DTO.MovieDto;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class VideoClubService {

    private final List<MovieDto> movies = new ArrayList<>();

    public List<MovieDto> getAll() {
        return new ArrayList<>(movies);
    }

    public MovieDto getById(Long id) {
        return movies.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addMovie(MovieDto movie) {
        movies.add(movie);
    }

    public void remove(Long id) {
        movies.removeIf(m -> m.getId().equals(id));
    }

    public int size() {
        return movies.size();
    }
}
