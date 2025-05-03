package com.duoc.RopaStoreValidation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.duoc.RopaStoreValidation.models.Productos;
import com.duoc.RopaStoreValidation.repositories.ProductosRepository;

@Service
public class ProductosServiceImpl implements ProductosService{
    @Autowired
    private ProductosRepository productosRepository;

    @Override
    public List<Productos> getAllProductos() {
        return productosRepository.findAll();
    }

    @Override
    public Productos createProducto(Productos productos) {
        productosRepository.save(productos);
    }

    @Override
    public Productos updateProducto(Long id, Productos productos){
        if(productostRepository.existsById(id)){
            productos.setId(id);
            return productosRepository.save(productos);
        }   else {
                return null;
        }
    }

    @Override
    public Optional<Productos> getProductoById(Long id) {
        return productosRepository.findById(id);
    }

    @Override
    public void deleteProducto(Long id) {
        productosRepository.deleteById(id);
    }    
}
