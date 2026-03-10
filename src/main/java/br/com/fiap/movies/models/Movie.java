package br.com.fiap.movies.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Movie {
    private Long id;
    private String title;
    private String synopsis;
    private Integer rating;
    private LocalDate releaseDate;
}
