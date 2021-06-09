package ru.puchkova.restcinemahometask.data.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="MOVIES")
public class MovieEntity {

    @Id
    @Column(name="movie_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long movie_id;
    @Column(name="movie_name")
    private String name;
    @Column(name="movie_description")
    private String description;
    @Column(name="movie_release_year")
    private String releaseYear;

    public MovieEntity() { }

    public MovieEntity(String name, String releaseYear, String description) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.description = description;
    }

    public Long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Long id) {
        this.movie_id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieEntity movieEntity = (MovieEntity) o;
        return movie_id.equals(movieEntity.movie_id) &&
                name.equals(movieEntity.name) &&
                description.equals(movieEntity.description) &&
                releaseYear.equals(movieEntity.releaseYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie_id, name, description, releaseYear);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", description ='" + description + '\'' +
                '}';
    }
}
