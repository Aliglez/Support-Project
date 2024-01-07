package dev.ali.SupportProjectBack.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.ali.SupportProjectBack.models.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    
}
