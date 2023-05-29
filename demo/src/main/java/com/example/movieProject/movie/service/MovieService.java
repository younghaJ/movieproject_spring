package com.example.movieProject.movie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.movieProject.movie.common.ResDTO;
import com.example.movieProject.movie.entity.MovieEntity;
import com.example.movieProject.movie.repository.MovieRepoistory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepoistory movieRepository;

    // public List<MovieEntity> getMovie(){
    //     List<MovieEntity> list = movieRepoistory.getMovieList();
    //     return list;
    // }

    public ResDTO<?> getMovieList() {
        return ResDTO.builder()
                .code(0)
                .message("영화 조회에 성공하였습니다.")
                .data(movieRepository.getMovieList())
                .build();
    }

}
