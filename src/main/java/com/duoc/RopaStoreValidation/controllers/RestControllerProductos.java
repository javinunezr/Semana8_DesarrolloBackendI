package com.duoc.RopaStoreValidation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.duoc.RopaStoreValidation.models.Productos;
import com.duoc.RopaStoreValidation.services.ProductosService;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*")

public class RestControllerProductos {
    @Autowired
    private ProductosService productosService;

    @GetMapping
    public List<Productos> getAllProductos() {
        return productosService.getAllProductos();
    }

    @PostMapping
    public void createProducto(@RequestBody Productos productos) {
        productosService.createProducto(productos);
    }

    @PutMapping("/{id}")
    public Productos updateProducto(@PathVariable Long id, @RequestBody Productos productos) {
        return productosService.updateProducto(id, productos);
    }

    @GetMapping("/{id}")
    public Optional<Productos> getProductoById(@PathVariable Long id) {
        return productosService.getProductoById(id);
    }

    // Metodo que traera todo el inventario de una sucursal
    @GetMapping("/sucursal/{id}")
    public List<Productos> obtenerProductosPorSucursal(@PathVariable Long id) {
        return productosService.obtenerProductosPorSucursal(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Long id) {
        productosService.deleteProducto(id);
    }
}
