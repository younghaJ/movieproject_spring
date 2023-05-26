package com.example.movieProject.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
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
    
    public void setMovieidx(int movieidx) {
        this.movieidx = movieidx;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
    public void setPlaytime(String playtime) {
        this.playtime = playtime;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
    public void setWatchott(String watchott) {
        this.watchott = watchott;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    public void setOpendt(String opendt) {
        this.opendt = opendt;
    }
    
}
