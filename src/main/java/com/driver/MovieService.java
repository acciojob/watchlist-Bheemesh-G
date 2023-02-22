package com.driver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(Movie movie)
    {
        return movieRepository.addMovie(movie);
    }

    public String addDirector(Director director)
    {
        return movieRepository.addDirector(director);
    }

    public String addMovieDirectorPair(String mName,String dName)
    {
        return movieRepository.addMovieDirectorPair(mName,dName);
    }

    public Movie getMovieByName(String movie)
    {
        return movieRepository.getMovieByName(movie);
    }

    public Director getDirectorByName(String name)
    {
        return movieRepository.getDirectorByName(name);
    }

    public ArrayList<String> getMoviesByDirectorName(String name)
    {
        return movieRepository.getMoviesByDirectorName(name);
    }

    public HashMap<String,Movie> findAllMovies()
    {
        return movieRepository.findAllMovies();
    }

    public String deleteDirectorByName(String name)
    {
        return movieRepository.deleteDirectorByName(name);
    }

    public String deleteAllDirectors()
    {
        return movieRepository.deleteAllDirectors();
    }
}
