package com.example.demo.Controllers;


import com.example.demo.DTO.MovieDto;
import com.example.demo.Services.VideoClubServices;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/VideoClub")
public class MovieController {

    public VideoClubServices vCServices;  // makes instances ready for use

    public MovieController(VideoClubServices vCServices){
        this.vCServices=vCServices;
    }

    @GetMapping("/movies")
    public List getAll(){
        return vCServices.getRegistered();
    }

    @GetMapping("/movies/{id}")
    public MovieDto getById(@RequestParam Long id){
        return vCServices.getById(id);}

    @PostMapping("/movies")
    public void addMovie(@RequestBody MovieDto movie){
        vCServices.addMovie(movie);
    }

    @GetMapping("/movies/count")
    public long countRegistered(){
        return vCServices.count();
    }

    @DeleteMapping("/movies/{id}")
    public void deleteMovie(@RequestParam long id){
        vCServices.remove(id);
    }
}
