package com.example.Spring.controller;

import com.example.Spring.model.Producto;
import com.example.Spring.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoService productoService;

    @GetMapping("/productos")
    public List<Producto> obtenerProductos() {
        return productoService.obtenerProductos();
    }
    @PostMapping("/productos")
    public Producto agregarProducto(@RequestBody Producto producto) {
        return productoService.agregarProducto(producto);
    }

}
