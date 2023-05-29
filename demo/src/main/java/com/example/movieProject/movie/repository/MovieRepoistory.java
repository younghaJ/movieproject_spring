package com.example.movieProject.movie.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.movieProject.movie.entity.MovieEntity;

@Repository
@Mapper
public interface MovieRepoistory {
    List<MovieEntity> getMovieList();
    List<MovieEntity> getMovie();
    String idx(String playTime);
}
