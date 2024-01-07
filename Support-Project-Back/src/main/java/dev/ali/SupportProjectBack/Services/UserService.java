package dev.ali.SupportProjectBack.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.ali.SupportProjectBack.Repositories.UserRepository;
import dev.ali.SupportProjectBack.models.Users;

@Service
public class UserService {
    UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<Users> getAll() {
        List<Users> users = repository.findAll();
        return users;
    }
    
}
