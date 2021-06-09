package ru.puchkova.restcinemahometask.data.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="CINEMAS")
public class CinemaEntity {

    @Id
    @Column(name="cinema_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long cinema_id;
    @Column(name="cinema_name")
    private String name;
    @Column(name="cinema_address")
    private String address;

    public CinemaEntity() { }

    public CinemaEntity(String name, String address) {
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
        CinemaEntity cinemaEntity = (CinemaEntity) o;
        return cinema_id.equals(cinemaEntity.cinema_id) &&
                name.equals(cinemaEntity.name) &&
                address.equals(cinemaEntity.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinema_id, name, address);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
