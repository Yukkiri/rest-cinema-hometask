package ru.puchkova.restcinemahometask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.puchkova.restcinemahometask.data.repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;


}
