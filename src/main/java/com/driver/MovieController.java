package com.driver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ResourceBundle;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("/add-movie")
    public ResponseEntity addMovie(@RequestBody() Movie movie)
    {

        return new ResponseEntity<>(movieService.addMovie(movie),HttpStatus.CREATED);
    }

    @PostMapping("/add-director")
    public ResponseEntity addDirector(@RequestBody() Director director)
    {
        return new ResponseEntity<>(movieService.addDirector(director),HttpStatus.CREATED);
    }

    @PutMapping("/add-movie-director-pair")
    public ResponseEntity addMovieDirectorPair(@RequestParam("moviename") String mName,@RequestParam("directorname") String dName)
    {
        return new ResponseEntity<>(movieService.addMovieDirectorPair(mName,dName),HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-movie-by-name/{name}")
    public ResponseEntity getMovieByName(@PathVariable("name") String movieName)
    {
        return new ResponseEntity<>(movieService.getMovieByName(movieName),HttpStatus.FOUND);
    }

    @GetMapping("/get-director-by-name/{name}")
    public ResponseEntity getDirectorByName(@PathVariable("name") String name)
    {
        return new ResponseEntity<>(movieService.getDirectorByName(name),HttpStatus.FOUND);
    }

    @GetMapping("/get-movies-by-director-name/{director}")
    public ResponseEntity getMoviesByDirectorName(@PathVariable("director") String name)
    {
        return new ResponseEntity<>(movieService.getMoviesByDirectorName(name),HttpStatus.FOUND);
    }

    @GetMapping("/get-all-movies")
    public ResponseEntity findAllMovies()
    {
        return new ResponseEntity<>(movieService.findAllMovies(),HttpStatus.FOUND);
    }

    @DeleteMapping("/delete-director-by-name")
    public ResponseEntity deleteDirectorByName(@RequestParam("name") String name)
    {
        return new ResponseEntity<>(movieService.deleteDirectorByName(name),HttpStatus.GONE);
    }
    @DeleteMapping("/delete-all-directors")
    public ResponseEntity deleteAllDirectors()
    {
        return new ResponseEntity<>(movieService.deleteAllDirectors(),HttpStatus.GONE);
    }


}
