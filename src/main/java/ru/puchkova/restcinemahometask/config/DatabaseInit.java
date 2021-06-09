package ru.puchkova.restcinemahometask.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.puchkova.restcinemahometask.data.entity.CinemaEntity;
import ru.puchkova.restcinemahometask.data.entity.CinemaScheduleEntity;
import ru.puchkova.restcinemahometask.data.entity.MovieEntity;
import ru.puchkova.restcinemahometask.data.repository.CinemaRepository;
import ru.puchkova.restcinemahometask.data.repository.CinemaScheduleRepository;
import ru.puchkova.restcinemahometask.data.repository.MovieRepository;

@Configuration
public class DatabaseInit {

    private static final Logger log = LoggerFactory.getLogger(DatabaseInit.class);

    @Bean
    CommandLineRunner initMovies(MovieRepository repository) {

        return args -> {
            log.info("Insert " + repository.save(
                        new MovieEntity("The Lord of the Rings: The Fellowship of the Ring", "2001", "First movie")
            ));
            log.info("Insert " + repository.save(
                    new MovieEntity("The Lord of the Rings: The Two Towers", "2002", "Second movie")
            ));
            log.info("Insert " + repository.save(
                    new MovieEntity("The Lord of the Rings: The Return of the King", "2003", "Third movie")
            ));

            log.info("Insert " + repository.save(
                    new MovieEntity("The Lord of the Rings: The Return of the King TEST", "2003", "Third movie")
            ));
        };
    }

    @Bean
    CommandLineRunner initCinemas(CinemaRepository repository) {

        return args -> {
            log.info("Insert " + repository.save(
                    new CinemaEntity("Film Forum", "209 W Houston St, New York City, NY 10014-4885")
            ));
            log.info("Insert " + repository.save(
                    new CinemaEntity("The Ziegfeld", "141 W 54th St, New York City, NY 10019-5302")
            ));

            log.info("Insert " + repository.save(
                    new CinemaEntity("Test", "test test 23")
            ));

            log.info("Insert " + repository.save(
                    new CinemaEntity("Testing", "test test 23")
            ));
        };
    }

    @Bean
    CommandLineRunner initCinemasSchedule(CinemaScheduleRepository repository, CinemaRepository cinema_repository) {

        return args -> {
            log.info("Insert " + repository.save(
                    new CinemaScheduleEntity(cinema_repository.getById(1L), "1,2,3")
            ));
            log.info("Insert " + repository.save(
                    new CinemaScheduleEntity(cinema_repository.getById(3L), "2")
            ));
        };
    }
}
