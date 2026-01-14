package com.molier.UserRegistration.Models;

import lombok.Data;
import lombok.ToString;
import jakarta.persistence.*;

@Data
@ToString(exclude = "password")
@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String password;
    private String email;
}
