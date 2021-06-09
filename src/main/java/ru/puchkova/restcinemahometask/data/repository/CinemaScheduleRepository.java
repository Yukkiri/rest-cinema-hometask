package ru.puchkova.restcinemahometask.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.puchkova.restcinemahometask.data.entity.CinemaScheduleEntity;

public interface CinemaScheduleRepository extends JpaRepository<CinemaScheduleEntity, Long> {
}
