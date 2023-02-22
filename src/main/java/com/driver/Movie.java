package com.driver;

public class Movie {
    private String name;
    private int numberOfMinutes;
    private double imdbRating;

    public Movie(String name, int numberOfMinutes, double imdbRating) {
        this.name = name;
        this.numberOfMinutes = numberOfMinutes;
        this.imdbRating = imdbRating;
    }

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMinutes() {
        return numberOfMinutes;
    }

    public void setNumberOfMinutes(int numberOfMinutes) {
        this.numberOfMinutes = numberOfMinutes;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}
