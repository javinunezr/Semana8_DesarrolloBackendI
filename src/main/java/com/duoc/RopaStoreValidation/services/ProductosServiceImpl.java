package com.duoc.RopaStoreValidation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.duoc.RopaStoreValidation.models.Productos;
import com.duoc.RopaStoreValidation.repositories.ProductosRepository;

@Service
public class ProductosServiceImpl implements ProductosService {
    private ProductosRepository productosRepository;

    @Autowired
    public ProductosServiceImpl(ProductosRepository productosRepository) {
        this.productosRepository = productosRepository;
    }

    // Lista todos los productos
    @Override
    public List<Productos> getAllProductos() {
        return productosRepository.findAll();
    }

    // Crea un producto
    @Override
    public void createProducto(Productos productos) {
        productosRepository.save(productos);
    }

    // Actualiza un producto
    @Override
    public Productos updateProducto(Long id, Productos productos) {
        if (productosRepository.existsById(id)) {
            productos.setIdProducto(id);
            return productosRepository.save(productos);
        } else {
            return null;
        }
    }

    // Obtiene un producto por id
    @Override
    public Optional<Productos> getProductoById(Long id) {
        return productosRepository.findById(id);
    }

    // Elimina un producto por id
    @Override
    public void deleteProducto(Long id) {
        productosRepository.deleteById(id);
    }
}
