package com.example.demo.DTO;


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

}

