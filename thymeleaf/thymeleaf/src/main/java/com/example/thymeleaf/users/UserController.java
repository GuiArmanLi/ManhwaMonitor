package com.example.thymeleaf.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public String getRegisterPage() {
        return "index";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        service.register(new UserModel("admin", "guilherme@gmail.com", "admin"));

        return "login";
    }

    @PostMapping
    public String register(UserModel user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(String username, String password) {
        return service.login(username, password);
    }

    // adicionar recuperar senha

}
