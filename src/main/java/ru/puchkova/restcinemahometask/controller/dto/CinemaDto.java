package ru.puchkova.restcinemahometask.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class CinemaDto {
    @JsonProperty("cinema_id")
    private Long cinema_id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private String address;

    public CinemaDto() {
    }

    public CinemaDto(Long cinema_id, String name, String address) {
        this.cinema_id = cinema_id;
        this.name = name;
        this.address = address;
    }

    public Long getCinema_id() {
        return cinema_id;
    }

    public void setCinema_id(Long cinema_id) {
        this.cinema_id = cinema_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CinemaDto cinemaDto = (CinemaDto) o;
        return Objects.equals(cinema_id, cinemaDto.cinema_id) &&
                Objects.equals(name, cinemaDto.name) &&
                Objects.equals(address, cinemaDto.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinema_id, name, address);
    }

    @Override
    public String toString() {
        return "CinemaDto{" +
                "cinema_id=" + cinema_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
