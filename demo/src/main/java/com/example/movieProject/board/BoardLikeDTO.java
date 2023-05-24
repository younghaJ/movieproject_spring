package com.example.movieProject.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardLikeDTO {
    private Integer likeIdx;
    private Integer boardIdx;
    private String userId;
    private Date likedDate;
}
