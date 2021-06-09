package ru.puchkova.restcinemahometask.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CinemaScheduleDto {
    @JsonProperty("schedule_id")
    private Long scheduleId;
//    @JsonProperty("cinema_id_key")
//    private long cinema_id;
    @JsonProperty("movie_id")
    private String movie_id;

    public CinemaScheduleDto() {
    }

    public CinemaScheduleDto(Long scheduleId, String movie_id) {
        this.scheduleId = scheduleId;
//        this.cinema_id = cinema_id;
        this.movie_id = movie_id;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

//    public long getCinema_id() {
//        return cinema_id;
//    }
//
//    public void setCinema_id(long cinema_id) {
//        this.cinema_id = cinema_id;
//    }

    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }
}
