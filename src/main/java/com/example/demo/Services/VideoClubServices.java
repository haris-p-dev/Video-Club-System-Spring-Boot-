package com.example.demo.Services;

import com.example.demo.DTO.MovieDto;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class VideoClubServices {

    private List<MovieDto> movieList = new ArrayList<>();

    private MovieDto instance;


    public void addMovie(MovieDto movie){
        movieList.add(movie);
    }

    public List getRegistered(){
        return movieList;
    }

    public MovieDto getById(Long id){
        for(MovieDto movie : movieList){
            if (id.equals(movie.getId())){
                return movie;
            }
        }
        return null;
    }


    public long getListSize(){
        return movieList.size();
    }

    public String remove(Long id){
        for(MovieDto movie : movieList){
            if (id.equals(movie.getId())){
                movieList.remove(movie);
                return "Movie removed";
            }
        }
        return "Movie does not exists in list";
    }


}
