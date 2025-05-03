package com.duoc.RopaStoreValidation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.duoc.RopaStoreValidation.models.Productos;
import com.duoc.RopaStoreValidation.services.ProductosService;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*")


public class RestControllerProductos {
    @Autowired
    private ProductosService productosService;

    @GetMapping
    public List<Productos> getAllProductos(){
        return productosService.getAllProductos();
    }

    @PostMapping
    public Productos createProducto(@RequestBody Productos productos) {
        return productosService.createProducto(productos);
    }
    
    @PutMapping("/{id}")
    public Productos updateProducto(@PathVariable Long id, @RequestBody Productos productos) {
        return productosService.updateProducto(id, productos);
    }
        
    @GetMapping("/{id}")
    public Optional<Productos> getProductoById(@PathVariable Long id) {
        return productosService.getProductoById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Long id){
        productosService.deleteProducto(id);
    }    
}

