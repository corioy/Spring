package com.example.Spring.controller;

import com.example.Spring.model.User;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Spring.service.AuthService;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String
            password) {
        if (authService.autenticar(username, password)) {
            return ResponseEntity.ok("Autenticación exitosa");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Autenticación fallida");
        }
    }
    @PostMapping("/registrar")
    public ResponseEntity<String> registrar(@RequestBody User user) {
        String userSaved = authService.registrar(user);
        return ResponseEntity.ok("usuario creado");
    }

}
