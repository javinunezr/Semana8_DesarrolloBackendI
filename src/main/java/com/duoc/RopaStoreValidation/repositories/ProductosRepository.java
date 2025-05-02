package com.duoc.RopaStoreValidation.repositories;

import java.util.ArrayList;
import java.util.List;

import com.duoc.RopaStoreValidation.models.Productos;

public class ProductosRepository {
    
    // Lista donde almacenaremos nuestros productos
    private final List<Productos> listaProductos = new ArrayList<>();

    // Metodo para listar productos de manera convencional
    public List<Productos> findAll() {
        return listaProductos;
    }    

    // Metodo para listar productos por ID de menor a mayor
    public List<Productos> listarPorIdAscendente() {
        // Creamos una copia para no modificar la lista original
        List<Productos> listaOrdenadaProductos = new ArrayList<>(listaProductos);
        listaOrdenadaProductos.sort((producto1, producto2) -> Integer.compare(producto1.getId(), producto2.getId()));
        return listaOrdenadaProductos;
    }

    // Metodo para agregar producto a la BDD
    public void agregarAListaProductos(Productos productos) {
        listaProductos.add(productos);
    }


    // Metodo para Buscar producto por ID
    public Productos findById(Long id) {
        for (Productos producto : listaProductos) {
            if (producto.getIdProducto() == id) {
                return producto;
            }
        }
        return null;
    }

    // Metodo para Eliminar producto por ID
    public boolean deleteById(Long id) {
        Productos producto = findById(id);
        if (producto != null) {
            listaProductos.remove(producto);
            return true;
        }
        return false;
    }    
}
