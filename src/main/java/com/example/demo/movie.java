package com.example.demo;

public class movie {
    private int id;
    private String title;
    private int year;
    private String director;

    public movie(int id, String title, int year, String director) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;

    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public int getYear(){
        return year;
    }

    public String getDirector(){
        return director;
    }


}
