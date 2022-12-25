package com.example.Springbootmultithreading002.repository;

import com.example.Springbootmultithreading002.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
