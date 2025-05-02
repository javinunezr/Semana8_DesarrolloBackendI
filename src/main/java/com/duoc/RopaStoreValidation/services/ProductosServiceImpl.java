package com.duoc.RopaStoreValidation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duoc.RopaStoreValidation.models.Productos;
import com.duoc.RopaStoreValidation.repositories.ProductosRepository;

@Service
public class ProductosServiceImpl {
    private final ProductosRepository productosRepository = new ProductosRepository();

    @Override
    public List<Productos> getAllProductos() {
        return productosRepository.findAll();
    }

    @Override
    public List<Productos> listarPorIdProductoMenorAMayor() {
        return productosRepository.listarPorIdProductoMenorAMayor();
    }

    @Override
    public void agregarAListaProductos(Productos productos) {
        productosRepository.agregarAListaProductos(productos);
    }

    @Override
    public Productos findById(Long id) {
        return productosRepository.findById(id);
    }

    @Override
    public boolean deleteById(Long id) {
        return productosRepository.deleteById(id);
    }
    
}
