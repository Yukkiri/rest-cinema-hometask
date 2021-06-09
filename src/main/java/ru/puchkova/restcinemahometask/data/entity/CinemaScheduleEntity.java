package ru.puchkova.restcinemahometask.data.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="CINEMAS_SCHEDULE")
public class CinemaScheduleEntity {

    @Id
    @Column(name="schedule_id")
    private Long schedule_id;
//    @Id
//    @Column(name="cinema_id_key")
//    private long cinema_id_key;
    @Column(name="movies")
    private String movies;

    public CinemaScheduleEntity() { }

    public CinemaScheduleEntity(CinemaEntity cinemaEntity, String movies) {
        this.schedule_id = cinemaEntity.getCinema_id();
        this.movies = movies;
    }

    public Long getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(Long schedule_id) {
        this.schedule_id = schedule_id;
    }

//    public long getCinema_id_key() {
//        return cinema_id_key;
//    }
//
//    public void setCinema_id_key(long cinema_id) {
//        this.cinema_id_key = cinema_id;
//    }

    public String getMovies() {
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CinemaScheduleEntity cinemaScheduleEntity = (CinemaScheduleEntity)  o;
        return schedule_id.equals(cinemaScheduleEntity.schedule_id) &&
                //cinema_id_key == cinemaScheduleEntity.cinema_id_key &&
                movies.equals(cinemaScheduleEntity.movies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedule_id, movies);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "meow ='" + schedule_id + '\'' +
                ", movies ='" + movies + '\'' +
                '}';
    }

}
