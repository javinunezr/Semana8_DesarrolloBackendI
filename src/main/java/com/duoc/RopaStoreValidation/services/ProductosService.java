package com.duoc.RopaStoreValidation.services;

import java.util.List;
import java.util.Optional;

import com.duoc.RopaStoreValidation.models.Productos;

public interface ProductosService {
    public List<Productos> getAllProductos();

    public void createProducto(Productos productos);

    public Productos updateProducto(Long id, Productos productos);

    public Optional<Productos> getProductoById(Long id);

    public void deleteProducto(Long id);

    // Metodo para buscar traer todos los productos de un inventario
    List<Productos> obtenerProductosPorSucursal(Long sucursalId);
}
