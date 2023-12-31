package com.example.thymeleaf.mangas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mangas")
public class MangaController {

    @Autowired
    MangaService service;

    @GetMapping
    public ModelAndView getHome() {
        return service.getHome();
    }

    // Nao vai
    @PostMapping
    public String register(MangaModel manga) {
        return service.register(manga);
    }

    // Nao vai
    @GetMapping("/{name}")
    public String getByName(@RequestBody String name) {
        return service.getByName(name);
    }

}
