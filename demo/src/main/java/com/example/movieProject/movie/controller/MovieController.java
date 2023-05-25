package com.example.movieProject.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

    @GetMapping("/list")
    public String getListPage() {

        return "/movieList";
    }

    
}
