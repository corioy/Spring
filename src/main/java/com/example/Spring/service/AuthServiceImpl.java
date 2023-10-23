package com.example.Spring.service;

import lombok.AllArgsConstructor;
import com.example.Spring.model.User;
import org.springframework.stereotype.Service;
import com.example.Spring.repository.UserRepository;

import java.util.Objects;

@Service
@AllArgsConstructor
public class AuthServiceImpl  implements AuthService{

    private final UserRepository userRepository;
    @Override
    public boolean autenticar(String username, String password) {

        User  existingUser = userRepository.findByUsername(username).orElseThrow();
        if(Objects.equals(username, existingUser.getUsername()) &&
         Objects.equals(password, existingUser.getPassword())){
            return  true;
        } else {
            return false;
        }
    }

    @Override
    public String registrar(User user) {
       userRepository.save(user);
       return "usuario creado";
    }
}
