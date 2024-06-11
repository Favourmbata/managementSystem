package com.UserManagementSystem.model;




import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastname;
    @Column(unique = true)
    private String email;
    private String password;
    private final LocalDate registrationDate = LocalDate.now();

}
