package com.UserManagementSystem;

import com.UserManagementSystem.dtos.request.RegisterRequest;
import com.UserManagementSystem.services.interfaces.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    private RegisterRequest request;

    @BeforeEach
    void setUp() {
        request.setFirstName("favy");
        request.setLastName("mba");
        request.setEmail("example@gmail.com");
        request.setPassword("password");
    }

    @Test
    @DisplayName("test that register user")
    void registerUser() {
        assertDoesNotThrow(() -> userService.registerCuster(request));
    }
}
