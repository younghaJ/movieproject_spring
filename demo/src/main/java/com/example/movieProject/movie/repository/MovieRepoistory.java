package com.example.movieProject.movie.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.movieProject.movie.entity.MovieEntity;

@Repository
@Mapper
public interface MovieRepoistory {
    MovieEntity getMovie(int movieidx);
}
