package com.example.film.models;



import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.*;
import java.util.Date;


@Data
@Entity
@Table(name = "sv_63_2021")
public class Film {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false, name = "Title")
    private String Title;
    @Column(nullable = false, name = "Genre")
    private String Genre;
    @Column(nullable = false, name = "Year")
    private Long Year;



}
