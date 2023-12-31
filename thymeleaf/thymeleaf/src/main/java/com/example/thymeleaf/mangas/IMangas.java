package com.example.thymeleaf.mangas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
interface IMangas extends JpaRepository<MangaModel, UUID> {
    MangaModel findByName(String name);
}
