package com.example.movieProject.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieEntity {
    private int movieidx;
    private String title;
    private String content;
    private String poster;
    private String genre;
    private String director;
    private String actor;
    private String playtime;
    private String age;
    private String trailer;
    private String watchott;
    private String maker;
    private String opendt;
}
