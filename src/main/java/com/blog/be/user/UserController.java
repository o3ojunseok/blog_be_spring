package com.blog.be.user;

import com.blog.be.user.dto.SignUpUserRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @GetMapping("/list")
    public ResponseEntity<List<User>> findAllUsers() {
        List<User> users = userService.findAllUsers();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findOneUser(@PathVariable("id") Long id) {
        Optional<User> user = userService.findOneUser(id);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PostMapping("/signup")
    public ResponseEntity<User> signUpUser(@RequestBody SignUpUserRequestDTO signUpUserRequestDTO) {
        User user = userService.signUpUser(signUpUserRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
