package com.example.film.services;


import com.example.film.models.Film;
import com.example.film.repositories.IFilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService implements IFilmService {

    @Autowired
    public IFilmRepository filmRepository;

    @Override
    public List<Film> findAll() {
        return filmRepository.findAll();
    }

    @Override
    public void createFilm(Film film) {
        if (film != null) {
            filmRepository.save(film);
        }

    }
}
