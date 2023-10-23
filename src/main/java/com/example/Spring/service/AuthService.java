package com.example.Spring.service;

import com.example.Spring.model.User;

public interface AuthService {

    boolean autenticar(String username, String password);

    String registrar(User user);

}
