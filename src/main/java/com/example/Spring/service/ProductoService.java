package com.example.Spring.service;

import com.example.Spring.model.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductoService {

    private List<Producto> productos = new ArrayList<>();
    private Integer id = 1;
    public List<Producto> obtenerProductos() {
        return productos;
    }

    public Producto agregarProducto(Producto producto) {
        producto.setId(id++);
        productos.add(producto);
        return producto;
    }

}
