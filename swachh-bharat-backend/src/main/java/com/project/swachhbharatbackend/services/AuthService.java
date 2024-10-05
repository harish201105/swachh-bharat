package com.project.swachhbharatbackend.services;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;

import com.project.swachhbharatbackend.exceptions.AlreadyExistsException;
import com.project.swachhbharatbackend.models.LoginRequest;
import com.project.swachhbharatbackend.models.LoginResponse;
import com.project.swachhbharatbackend.models.User;

public interface AuthService {


    User register(User user, boolean isDriver) throws IllegalArgumentException, AlreadyExistsException;

    LoginResponse login(LoginRequest loginRequest) throws DisabledException, BadCredentialsException;
}
