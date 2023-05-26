package com.example.movieProject.movie.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.movieProject.movie.entity.MovieEntity;
import com.example.movieProject.movie.service.MovieService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MovieController {

    @GetMapping("/list")
    public String list( ) {
        return "movieList";
    }    
}
