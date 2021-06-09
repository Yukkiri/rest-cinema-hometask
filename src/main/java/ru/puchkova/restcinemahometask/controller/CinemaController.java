package ru.puchkova.restcinemahometask.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.puchkova.restcinemahometask.controller.dto.CinemaDto;
import ru.puchkova.restcinemahometask.controller.dto.CinemaScheduleDto;
import ru.puchkova.restcinemahometask.controller.dto.MovieDetailsDto;
import ru.puchkova.restcinemahometask.controller.dto.MovieDto;
import ru.puchkova.restcinemahometask.controller.exceptions.MovieNotFoundException;
import ru.puchkova.restcinemahometask.data.repository.CinemaRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CinemaController {

    @Autowired
    private CinemaRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    CinemaController(CinemaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cinemas")
    List<CinemaDto> all() {
        var cinemas = repository.findAll();

        return cinemas.stream().map(cinemaEntity ->
                modelMapper.map(cinemaEntity, CinemaDto.class)
        ).collect(Collectors.toList());
    }


    @GetMapping("/cinemas/{id}")
    CinemaScheduleDto oneCinema(@PathVariable Long cinema_id) {
        var cinemaScheduleEntity = repository.findById(cinema_id)
                .orElseThrow(() -> new MovieNotFoundException(cinema_id));
        return modelMapper.map(cinemaScheduleEntity, CinemaScheduleDto.class);
    }
//    List<CinemaScheduleDto> schedule() {
//        throw new UnsupportedOperationException("Not implemented yet");
//    }
}
