package com.example.thymeleaf.mangas;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MangaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
}
