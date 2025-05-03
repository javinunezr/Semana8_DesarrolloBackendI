package com.duoc.RopaStoreValidation.services;

import java.util.List;
import java.util.Optional;
import com.duoc.RopaStoreValidation.models.Productos;

@Service
public interface ProductosService {
    List<Productos> getAllProductos();
    Productos createProducto(Productos productos);    
    Productos updateProducto(Long id, Productos productos);
    Optional<Productos> getProductoById(Long id); 
    void deleteProducto(Long id);    
}
