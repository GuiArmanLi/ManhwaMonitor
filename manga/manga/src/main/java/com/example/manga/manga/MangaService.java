package com.example.manga.manga;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MangaService {
    @Autowired
    IManga mangas;

    public List<MangaModel> findAll() {
        return mangas.findAll();
    }

    public MangaModel findByName(String name) {
        return mangas.findByName(name);
    }

    public MangaModel save(MangaModel manga) {
        return mangas.save(manga);
    }

    public MangaModel update(MangaModel manga) {
        MangaModel mangaFound = mangas.findByName(manga.getName());

        if (mangaFound != null) {
            mangas.delete(mangaFound);

            UUID idManga = mangaFound.getId();
            manga.setId(idManga);
        }

        return mangas.save(manga);
    }

    public MangaModel delete(String name) {
        MangaModel mangaFound = mangas.findByName(name);

        if (mangaFound != null) {
            mangas.delete(mangaFound);
        }

        return mangaFound;
    }
}
