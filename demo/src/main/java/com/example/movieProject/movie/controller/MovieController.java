package com.example.movieProject.movie.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.movieProject.movie.entity.MovieEntity;
import com.example.movieProject.movie.service.MovieService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("data", movieService.getMovieList().getData());
        System.out.println(movieService.getMovieList());
        return "movieList";
    }
    
    @GetMapping("/detail")
    public String movieDetail() {
        return "movieDetail";
    }
}