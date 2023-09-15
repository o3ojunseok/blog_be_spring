package com.blog.be.user;

import com.blog.be.common.DateTimeEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends DateTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String user_email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = true)
    private Date login_at;

    @Builder
    public User(String user_email, String password, Date login_at) {
        this.user_email = user_email;
        this.password = password;
        this.login_at = login_at;
    }
}
