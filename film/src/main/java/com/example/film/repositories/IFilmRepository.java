package com.example.film.repositories;

import com.example.film.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IFilmRepository extends JpaRepository<Film, Long> {


}
