package com.example.thymeleaf.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUser users;

    public String register(UserModel newUser) {
        for (UserModel user : users.findAll()) {
            if (newUser.getEmail().equalsIgnoreCase(user.getEmail())
                    || newUser.getUsername().equals(user.getUsername())) {
                return "index";
            }
        }

        users.save(newUser);
        return "redirect:/login";
    }

    public String login(String username, String password) {
        for (UserModel user : users.findAll()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return "redirect:/mangas";
            }
        }
        return "redirect:/login";
    }

}
