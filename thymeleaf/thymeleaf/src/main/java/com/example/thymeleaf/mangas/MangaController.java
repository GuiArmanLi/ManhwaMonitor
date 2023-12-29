package com.example.thymeleaf.mangas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MangaController {
    @Autowired
    IMangas mangas;

    @Autowired
    MangaService service;

    @GetMapping("/mangas")
    public ModelAndView getMangas() {
        ModelAndView mw = new ModelAndView("mangas");
        mw.addObject("mangas");
        return mw;
    }


}
