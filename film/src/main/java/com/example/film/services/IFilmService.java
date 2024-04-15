package com.example.film.services;

import com.example.film.models.Film;

import java.util.List;

public interface IFilmService {

    public List<Film> findAll();

    public void createFilm(Film film);
}
