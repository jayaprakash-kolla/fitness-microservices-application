package com.fitness.userservice.dto;

// This class contains all the response should be seen by the user

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class UserResponse {

    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
