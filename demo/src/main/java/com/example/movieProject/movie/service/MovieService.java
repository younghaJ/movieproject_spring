package com.example.movieProject.movie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.movieProject.movie.entity.MovieEntity;
import com.example.movieProject.movie.repository.MovieRepoistory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepoistory movieRepoistory;

    public List<MovieEntity> getMovie(){
        List<MovieEntity> list = movieRepoistory.getMovieList();
        System.out.println(list.get(0).getActor());
        System.out.println(list.get(0).getAge());
        System.out.println(list.get(0).getTitle());
        return list;
    } 
    // public String idx(){
    //     String title = movieRepoistory.idx("124");
    //     System.out.println(title);
    //     return title;
    // }

}
