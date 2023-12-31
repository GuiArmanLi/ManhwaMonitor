package com.example.thymeleaf.mangas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Service;

@Service
public class MangaService {
    @Autowired
    IMangas mangas;

    public ModelAndView getHome() {
        ModelAndView mw = new ModelAndView("manga");
        mw.addObject("mangas", mangas.findAll());
        return mw;
    }

    public String register(MangaModel newManga) {
        for (MangaModel manga : mangas.findAll()) {
            if (newManga.getName().equalsIgnoreCase(manga.getName())) {
                return "redirect:/mangas";
            }
        }

        mangas.save(newManga);
        return "redirect:/mangas";
    }

    public String getByName(String name) {
        MangaModel manga = mangas.findByName(name);
        mangas.save(manga);

        return "redirect:/mangas";
    }
}
