package com.rnd4impact.order_service.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDTO {

    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String imageUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
