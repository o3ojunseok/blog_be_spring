package com.blog.be.user;

import com.blog.be.user.dto.SignUpUserRequestDTO;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
    public Optional<User> findOneUser(Long id) {
        return userRepository.findById(id);
    }
    @Transactional
    public User signUpUser(SignUpUserRequestDTO signUpUserRequestDTO) {
        User user = User.builder()
                .email(signUpUserRequestDTO.getEmail())
                .name(signUpUserRequestDTO.getName())
                .password(bCryptPasswordEncoder.encode(signUpUserRequestDTO.getPassword()))
                .build();
        userRepository.save(user);
        return user;
    }
}
