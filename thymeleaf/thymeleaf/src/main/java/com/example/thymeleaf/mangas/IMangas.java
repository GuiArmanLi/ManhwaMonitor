package com.example.thymeleaf.mangas;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface IMangas extends JpaRepository<MangaModel, UUID> {

}
