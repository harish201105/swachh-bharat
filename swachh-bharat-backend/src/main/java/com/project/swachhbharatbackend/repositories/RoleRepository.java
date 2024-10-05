package com.project.swachhbharatbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.swachhbharatbackend.models.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
}
