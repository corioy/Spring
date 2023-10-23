package com.example.Spring.service;

import org.springframework.stereotype.Service;

@Service
public class MensajeServiceImpl implements MensajeService{
    @Override
    public String obtenerMensaje() {
        return "Hola, este es un mensaje de ejemplo.";
    }
}
