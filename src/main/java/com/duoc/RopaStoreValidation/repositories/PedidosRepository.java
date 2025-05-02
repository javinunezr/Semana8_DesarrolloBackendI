package com.duoc.RopaStoreValidation.repositories;

import java.util.ArrayList;
import java.util.List;

import com.duoc.RopaStoreValidation.models.Pedidos;

public class PedidosRepository {
 
    // Lista donde almacenaremos nuestros pedidos
    private final List<Pedidos> listaPedidos = new ArrayList<>();

    // Metodo para listar pedidos de manera convencional
    public List<Pedidos> findAll() {
        return listaPedidos;
    }    

    // Metodo para listar pedidos por ID de menor a mayor
    public List<Pedidos> listarPorIdAscendente() {
        // Creamos una copia para no modificar la lista original
        List<Pedidos> listaOrdenadaPedidos = new ArrayList<>(listaPedidos);
        listaOrdenadaPedidos.sort((pedido1, pedido2) -> Integer.compare(pedido1.getId(), pedido2.getId()));
        return listaOrdenadaPedidos;
    }

    // Metodo para Buscar pedido por ID
    public Pedidos findById(Long id) {
        for (Pedidos pedido : listaPedidos) {
            if (pedido.getIdPedido() == id) {
                return pedido;
            }
        }
        return null;
    }

    // Metodo para Eliminar pedido por ID
    public boolean deleteById(Long id) {
        Pedidos pedido = findById(id);
        if (pedido != null) {
            listaPedidos.remove(pedido);
            return true;
        }
        return false;
    }  
    
}
