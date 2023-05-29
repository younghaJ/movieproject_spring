package com.example.movieProject.movie.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.example.movieProject.movie.entity.MovieEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class MovieDTO {

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ResBasic {
        private List<Movie> movieList;

        // 해당 static class 내부에서만 사용하는 클래스
        @Data
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        static class Movie {
            int movieidx;
            String title;
            String content;
            String poster;
            String genre;
            String director;
            String actor;
            String playtime;
            String age;
            String trailer;
            String watchott;
            String maker;
            String opendt;
        }

        // 엔티티에서 DTO로 변환, 팩토리 메소드
        public static ResBasic fromEntityList(List<MovieEntity> movieEntityList) {
            // map 기존 리스트 데이터를 다른 타입의 리스트 데이터로 변경
            List<Movie> movieList = movieEntityList.stream().map(movieEntity -> {
                return Movie.builder()
                        .movieidx(movieEntity.getMovieidx())
                        .title(movieEntity.getTitle())
                        .content(movieEntity.getContent())
                        .poster(movieEntity.getPoster())
                        .genre(movieEntity.getGenre())
                        .director(movieEntity.getDirector())
                        .actor(movieEntity.getActor())
                        .playtime(movieEntity.getPlaytime())
                        .age(movieEntity.getAge())
                        .trailer(movieEntity.getTrailer())
                        .watchott(movieEntity.getWatchott())
                        .maker(movieEntity.getMaker())
                        .opendt(movieEntity.getOpendt())
                        .build();
            }).collect(Collectors.toList());

            return new ResBasic(movieList);
        }
    }
}
