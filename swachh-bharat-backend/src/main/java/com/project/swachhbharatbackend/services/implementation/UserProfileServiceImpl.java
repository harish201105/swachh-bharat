package com.project.swachhbharatbackend.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.swachhbharatbackend.exceptions.NotFoundException;
import com.project.swachhbharatbackend.models.*;
import com.project.swachhbharatbackend.repositories.RoleRepository;
import com.project.swachhbharatbackend.repositories.UserRepository;
import com.project.swachhbharatbackend.services.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public User updateUserProfile(User user) throws NotFoundException, IllegalArgumentException {
        if (user == null ||
                user.getName() == null || user.getName().isBlank() ||
                user.getUsername() == null || user.getUsername().isBlank() ||
                user.getMobNumber() == null || user.getMobNumber().isBlank() ||
                user.getAddress() == null || user.getAddress().isBlank())
            throw new IllegalArgumentException("Mandatory fields can't be empty!");

        else if (user.getPassword() != null && !user.getPassword().isBlank() && user.getPassword().length() < 8)
            throw new IllegalArgumentException("Password should be minimum 8 characters long!");

        else {
            User temp = userRepository.findByUsername(user.getUsername());
            if (temp == null) {
                throw new NotFoundException("User doesn't exists!");
            } else {
                temp.setName(user.getName());
                temp.setUsername(user.getUsername());
                if(user.getPassword() != null && !user.getPassword().isBlank()) {
                    temp.setPassword(passwordEncoder.encode(user.getPassword()));
                }
                temp.setMobNumber(user.getMobNumber());
                temp.setAddress(user.getAddress());

                Role driverRole = roleRepository.findById("DRIVER_USER").isPresent() ? roleRepository.findById("DRIVER_USER").get() : null;

                if(temp.getRoles().contains(driverRole)){
                    temp.setPickupCities(user.getPickupCities());
                    System.out.println("temp : " + temp.toString());
                }
                return userRepository.save(temp);
            }
        }
    }
}
