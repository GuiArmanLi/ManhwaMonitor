package com.example.manga.manga;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mangas")
@CrossOrigin("*")
public class MangaController {
    @Autowired
    MangaService service;

    @GetMapping
    public List<MangaModel> findAll() {
        return service.findAll();
    }

    @GetMapping("/{name}")
    public MangaModel findByName(@PathVariable String name) {
        return service.findByName(name);
    }

    @PostMapping
    public MangaModel save(@RequestBody MangaModel manga) {
        return service.save(manga);
    }

    @PutMapping
    public MangaModel update(@RequestBody MangaModel manga) {
        return service.update(manga);
    }

    @DeleteMapping
    public MangaModel delete(@RequestBody String name) {
        return service.delete(name);
    }
}
