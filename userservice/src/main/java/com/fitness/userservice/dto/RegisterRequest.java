package com.fitness.userservice.dto;

// This class contains the info which is accepted from the user to register (or) create an account.

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "password is required")
    @Size(min = 6, message = "password must have atleast 6 characters")
    private String password;

    private String firstName;
    private String lastName;


}
