package com.example.movieProject.movie.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.movieProject.movie.service.MovieService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MovieControllerApiV1 {
   
    private final MovieService movieService;

    // @GetMapping("/getMovieList")
    // public Model getListPage(Model model) {
    //     List<MovieEntity> data = movieService.getMovie();
    //     //String title = movieService.idx();
    //     model.addAttribute("data", data);
    //     System.out.println("컨트롤러 : "+data.get(0).getTitle());
    //     return model;
    // }
}
