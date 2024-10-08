package com.project.swachhbharatbackend;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.project.swachhbharatbackend.models.Role;
import com.project.swachhbharatbackend.repositories.RoleRepository;

import java.util.Arrays;

@SpringBootApplication
public class SwachhBharatBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwachhBharatBackendApplication.class, args);
    }

    @Bean
    public ApplicationRunner initializer(RoleRepository roleRepository) {
        return args -> roleRepository.saveAll(Arrays.asList(
                Role.builder().roleName("NORMAL_USER").roleDescription("User who will upload the location").build(),
                Role.builder().roleName("DRIVER_USER").roleDescription("User who will pickup the garbage from location").build()));
    }
}
