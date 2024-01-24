package com.example.manga.manga;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface IManga extends JpaRepository<MangaModel, UUID> {
    MangaModel findByName(String name);
}
