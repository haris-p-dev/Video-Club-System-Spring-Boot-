package com.example.demo.Controllers;


import com.example.demo.DTO.MovieDto;
import com.example.demo.Services.StatisticsService;
import com.example.demo.Services.VideoClubService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/video-club/movies")
public class MovieController {

    private final VideoClubService videoClubService;
    private final StatisticsService statisticsService;

    public MovieController(VideoClubService videoClubService,
                           StatisticsService statisticsService) {
        this.videoClubService = videoClubService;
        this.statisticsService = statisticsService;
    }

    @GetMapping
    public List<MovieDto> getAll() {
        return videoClubService.getAll();
    }

    @GetMapping("/{id}")
    public MovieDto getById(@PathVariable Long id) {
        return videoClubService.getById(id);
    }

    @PostMapping
    public void addMovie(@RequestBody MovieDto movie) {
        videoClubService.addMovie(movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id) {
        videoClubService.remove(id);
    }

    @GetMapping("/count")
    public long count() {
        return statisticsService.count();
    }
}

