package com.example.demo.Services;

import com.example.demo.DTO.MovieDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Service
public class VideoClubServices {
    private List<MovieDto> movieList = new ArrayList<>();

    private MovieDto instance;


    public void addMovie(@RequestBody MovieDto movie){
        movieList.add(movie);
    }

    public List getRegistered(){
        return movieList;
    }

    public  MovieDto getById(Long id){
        if (movieList.contains(id)) {
            return instance.id();
        }
    }
    public long count(){
        return movieList.size();
    }

    public void remove(long id){
        movieList.remove(instance.getId());

    }


}
