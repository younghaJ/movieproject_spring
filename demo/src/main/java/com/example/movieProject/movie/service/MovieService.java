package com.example.movieProject.movie.service;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.movieProject.movie.entity.MovieEntity;
import com.example.movieProject.movie.repository.MovieRepoistory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepoistory movieRepoistory;

    public ArrayList<MovieEntity> getMovie(){
        return movieRepoistory.getMovieList();
    } 

}
