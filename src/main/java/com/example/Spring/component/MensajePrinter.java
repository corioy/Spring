package com.example.Spring.component;

import com.example.Spring.service.MensajeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class MensajePrinter {

    private final MensajeService mensajeService;
    @Autowired
    public MensajePrinter(MensajeService mensajeService) {
        this.mensajeService = mensajeService;
    }

    public void imprimirMensaje() {
        String mensaje = mensajeService.obtenerMensaje();
        System.out.println(mensaje);
    }
}
