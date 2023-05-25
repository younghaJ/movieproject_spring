package com.example.movieProject.movie.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.movieProject.movie.entity.MovieEntity;

@Repository
@Mapper
public interface MovieRepoistory {
    ArrayList<MovieEntity> getMovieList();
}
