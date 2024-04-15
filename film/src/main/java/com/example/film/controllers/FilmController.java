package com.example.film.controllers;


import com.example.film.dtos.FilmPOSTDto;
import com.example.film.models.Film;
import com.example.film.services.FilmService;
import com.example.film.services.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/films")
public class FilmController {

    @Autowired
    public IFilmService filmService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Film>> getFilms() {
        List<Film> films = filmService.findAll();
        return new ResponseEntity<Collection<Film>>(films, HttpStatus.OK);
    }

    @PostMapping(value="/newFilm", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Film> createFilm(@RequestBody FilmPOSTDto film) {
        System.out.println(film.getTitle());
        Film newFilm = new Film();
        newFilm.setGenre(film.getGenre());
        newFilm.setYear(film.getYear());
        newFilm.setTitle(film.getTitle());
        filmService.createFilm(newFilm);
        return new ResponseEntity<Film>(newFilm, HttpStatus.OK);
    }

}
