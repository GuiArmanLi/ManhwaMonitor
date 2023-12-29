package com.example.thymeleaf.mangas;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MangaModel {
    @Id
    private UUID id;
    private UUID idUser;
}
