package com.example.thymeleaf.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IUser extends JpaRepository<UserModel, UUID> {
}
