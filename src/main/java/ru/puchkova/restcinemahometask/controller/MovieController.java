package ru.puchkova.restcinemahometask.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.puchkova.restcinemahometask.controller.dto.CinemaDto;
import ru.puchkova.restcinemahometask.controller.dto.MovieDetailsDto;
import ru.puchkova.restcinemahometask.controller.dto.MovieDto;
import ru.puchkova.restcinemahometask.data.repository.MovieRepository;
import ru.puchkova.restcinemahometask.controller.exceptions.MovieNotFoundException;
import ru.puchkova.restcinemahometask.service.MovieService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private MovieRepository repository;

    @GetMapping("/movies")
    List<MovieDto> all() {
        var movies = repository.findAll();

        return movies.stream().map(movieEntity ->
                modelMapper.map(movieEntity, MovieDto.class)
        ).collect(Collectors.toList());
    }

    @GetMapping("/movies/{id}")
    MovieDetailsDto one(@PathVariable Long movie_id) {
        var movieEntity = repository.findById(movie_id)
                .orElseThrow(() -> new MovieNotFoundException(movie_id));
        return modelMapper.map(movieEntity, MovieDetailsDto.class);
    }

    @GetMapping("/movies/{id}/cinemas")
    List<CinemaDto> cinemas(@PathVariable Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
