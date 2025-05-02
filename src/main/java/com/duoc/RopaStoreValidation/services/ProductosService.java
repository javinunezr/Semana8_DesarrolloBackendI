package com.duoc.RopaStoreValidation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duoc.RopaStoreValidation.models.Productos;

@Service
public interface ProductosService {
    List<Productos> getAllPedidoList();
    List<Productos> listarPorIdProductoMenorAMayor();
    void agregarAListaProductos(Productos productos);    
    Productos findById(Long id); 
    boolean deleteById(Long id);    
}
