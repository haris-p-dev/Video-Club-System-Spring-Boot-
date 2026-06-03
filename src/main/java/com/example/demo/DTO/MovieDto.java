package com.example.demo.DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

public class MovieDto {

        private long id;
        private String title;
        private String director;
        private int year;



    public MovieDto(Long id,String title,String director, int year){
            this.id=id;
            this.title=title;
            this.director=director;
            this.year=year;
        }

    public long getId() {
        return id;
    }
      public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }
}

