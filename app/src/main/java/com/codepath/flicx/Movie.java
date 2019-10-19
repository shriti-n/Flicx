package com.codepath.flicx;

public class Movie {

    String name;
    String image;
    String description;

    public Movie(String name, String description, String image){
        this.name = name;
        this.description = description;
        this.image = image;
    }

    String getMovieName(){
        return name;
    }

    String getMovieDescription(){
        return description;
    }

    String getMovieImage(){
        return image;
    }

}
