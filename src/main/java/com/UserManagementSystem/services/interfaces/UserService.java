package com.UserManagementSystem.services.interfaces;

import com.UserManagementSystem.dtos.request.RegisterRequest;
import com.UserManagementSystem.model.User;

public interface UserService {
    User registerCuster(RegisterRequest request);
}
