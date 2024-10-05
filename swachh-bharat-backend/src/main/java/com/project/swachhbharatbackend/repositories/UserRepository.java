package com.project.swachhbharatbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.swachhbharatbackend.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
