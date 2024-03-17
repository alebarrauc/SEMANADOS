package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


//
@RestController
public class movieController {
    private List<movie> movies = new ArrayList<>();
    
   public movieController(){
    movies.add(new movie(1, "cloud atlas", 2012, "Wachoski Brothers"));

   }


@GetMapping("/movies")
public List<movie> getMovies(){
    return movies;
}
}