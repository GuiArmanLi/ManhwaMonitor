package com.example.thymeleaf.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private IUser users;

    @Autowired
    private UserService service;

    @GetMapping
    public String getRegisterPage() {
        return "index";
    }

    @PostMapping
    public String registerUser(UserModel user) {
        return service.register(user);
    }

    @GetMapping("/login")
    public String getLoginPage() {
        service.register(new UserModel("admin", "guilherme@gmail.com", "admin"));
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(String username, String password) {
        return service.login(username, password);
    }

    @GetMapping("/users/home")
    public ModelAndView getHome() {
        ModelAndView mw = new ModelAndView("home");
        mw.addObject("user", users.findAll());
        return mw;
    }

    @PostMapping("/users/home")
    public String registerManga() {
        return "home";
    }

    @GetMapping("/users/mangas")
    public ModelAndView getMangas() {
        ModelAndView mw = new ModelAndView("mangas");
        mw.addObject("users", users.findAll());
        return mw;
    }



}
