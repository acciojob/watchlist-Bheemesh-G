package com.driver;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class MovieRepository {
    HashMap<String,Movie> m = new HashMap<>();
    HashMap<String,Director> d = new HashMap<>();

    HashMap<String, ArrayList<String>> st = new HashMap<>();

    //for adding movie
    public String addMovie(Movie movie)
    {
        m.put(movie.getName(),movie);

        return "Movie Added Successfully.....";
    }

    //for adding director
    public String addDirector(Director director)
    {
        d.put(director.getName(),director);

        return "Director Added Successfully.....";
    }


    //for adding movie and director pair
    public String addMovieDirectorPair(String mName,String dName)
    {
        if(m.containsKey(mName) && d.containsKey(dName))
        {
            if(st.containsKey(dName))
            {
                ArrayList<String> temp = st.get(dName);
                temp.add(mName);
                st.put(dName,temp);
            }
            else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(mName);
                st.put(dName,temp);
            }

            return "MovieAndDirector Pair Added Successfully.....";
        }

        return "MovieAndDirector Pair Does not Match.....";
    }


    //for getting movie
    public Movie getMovieByName(String movie)
    {

         if(!m.containsKey(movie))
         {
             return new Movie();
         }

         return m.get(movie);
    }


    //for getting director
    public Director getDirectorByName(String name)
    {
        if(!d.containsKey(name))
        {
            return new Director();
        }

        return d.get(name);
    }

    //list of movies of a director
    public ArrayList<String> getMoviesByDirectorName(String name)
    {
        if(!st.containsKey(name))
        {
            return new ArrayList<>();
        }

        return st.get(name);
    }

    //for printing all movies
    public HashMap<String,Movie> findAllMovies()
    {
        return m;
    }

    public String deleteDirectorByName(String name)
    {
        if(!st.containsKey(name))
        {
            return "Director Not Found....";
        }

        st.remove(name);

        return "Successfully Deleted The Director....";
    }

    public String deleteAllDirectors()
    {
        st.clear();

        return "All Directors Deleted Successfully....";
    }



}