package com.example.demo.DTO;


public class MovieDto {

    private Long id;
    private String title;
    private String director;
    private int year;

    public MovieDto() {}

    public MovieDto(Long id, String title, String director, int year) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDirector() { return director; }
    public int getYear() { return year; }

    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setDirector(String director) { this.director = director; }
    public void setYear(int year) { this.year = year; }
}

