package com.blog.be.user.dto;

import com.blog.be.user.User;

import java.time.LocalDateTime;
import java.util.Date;

public class UserResponseDTO {
    private final Long id;
    private final String email;
    private final String name;
    private final String password;
    private final Date loginAt;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public UserResponseDTO(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.name = user.getName();
        this.password = user.getPassword();
        this.loginAt = user.getLoginAt();
        this.createdAt = user.getCreatedAt();
        this.updatedAt = user.getUpdatedAt();
    }
}
