package dev.ali.SupportProjectBack.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ali.SupportProjectBack.Services.UserService;
import dev.ali.SupportProjectBack.models.Users;

@RestController
@RequestMapping(path = "${api-endpoint}/users")
public class UserController {
    UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Users> index() {
        List<Users> users = service.getAll();
        return users;
    }
}
