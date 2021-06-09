package ru.puchkova.restcinemahometask.controller.dto;

public class MovieDetailsDto {

    private Long movie_id;
    private String name;
    private String description;
    private String releaseYear;

    public MovieDetailsDto() { }

    public MovieDetailsDto(String name, String releaseYear, String description) {
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
}
