package ru.puchkova.restcinemahometask.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.puchkova.restcinemahometask.data.entity.MovieEntity;

public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
}
