package com.blog.be.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthUserDTO {
    private String email;
    private String name;
    private String password;
}
