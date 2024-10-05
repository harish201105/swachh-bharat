package com.project.swachhbharatbackend.services;

import com.project.swachhbharatbackend.exceptions.NotFoundException;
import com.project.swachhbharatbackend.models.User;

public interface UserProfileService {
    
    User updateUserProfile(User user) throws NotFoundException, IllegalArgumentException;
}
