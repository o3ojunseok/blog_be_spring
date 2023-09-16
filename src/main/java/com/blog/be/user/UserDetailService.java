package com.blog.be.user;



import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String user_email) {
        return userRepository.findByEmail(user_email)
                .orElseThrow(() -> new IllegalArgumentException((user_email)));
    }
}
