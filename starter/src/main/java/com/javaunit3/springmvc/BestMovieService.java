package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BestMovieService {

    private Movie movie;

    // Define a private Movie property and use Spring annotations so that it is Autowired.
    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie) {
        this.movie = movie;
    }

    public Movie getBestMovie() {
        return movie;
    }
}
