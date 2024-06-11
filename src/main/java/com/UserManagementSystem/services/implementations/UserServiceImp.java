package com.UserManagementSystem.services.implementations;

import com.UserManagementSystem.dtos.request.RegisterRequest;
import com.UserManagementSystem.repositories.UserRepository;
import com.UserManagementSystem.services.interfaces.UserService;
import com.UserManagementSystem.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;
    @Override
    public User registerCuster(RegisterRequest request) {
        if (userRepository.existsByEmail(request.getEmail()))
         throw new RuntimeException("email already exist");
        return null;
    }
}
