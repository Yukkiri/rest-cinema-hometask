package ru.puchkova.restcinemahometask.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class MovieDto {

    @JsonProperty("movie_id")
    private Long movie_id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("releaseYear")
    private String releaseYear;

    public MovieDto() {
    }

    public MovieDto(Long movie_id, String name, String releaseYear) {
        this.movie_id = movie_id;
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Long movie_id) {
        this.movie_id = movie_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieDto movieDto = (MovieDto) o;
        return Objects.equals(movie_id, movieDto.movie_id) &&
                Objects.equals(name, movieDto.name) &&
                Objects.equals(releaseYear, movieDto.releaseYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie_id, name, releaseYear);
    }

    @Override
    public String toString() {
        return "MovieDto{" +
                "movie_id =" + movie_id +
                ", name='" + name + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                '}';
    }
}
