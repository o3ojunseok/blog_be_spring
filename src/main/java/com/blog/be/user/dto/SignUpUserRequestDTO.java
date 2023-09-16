package com.blog.be.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpUserRequestDTO {

    private String email;
    private String name;
    private String password;
}
