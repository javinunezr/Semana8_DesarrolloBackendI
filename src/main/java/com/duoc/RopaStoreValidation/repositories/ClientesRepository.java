package com.duoc.RopaStoreValidation.repositories;

import java.util.ArrayList;
import java.util.List;

import com.duoc.RopaStoreValidation.models.Clientes;

public class ClientesRepository {
    // Lista donde almacenaremos nuestros clientes
    private final List<Clientes> listaClientes = new ArrayList<>();

    // Metodo para listar clientes de manera convencional
    public List<Clientes> findAll() {
        return listaClientes;
    }    

    // Metodo para listar clientes por ID de menor a mayor
    public List<Clientes> listarPorIdAscendente() {
        // Creamos una copia para no modificar la lista original
        List<Clientes> listaOrdenadaClientes = new ArrayList<>(listaClientes);
        listaOrdenadaClientes.sort((cliente1, cliente2) -> Integer.compare(cliente1.getId(), cliente2.getId()));
        return listaOrdenadaClientes;
    }

    // Metodo para agregar cliente a la BDD
    public void agregarAListaCliente(Clientes clientes) {
        listaClientes.add(clientes);
    }


    // Metodo para Buscar cliente por ID
    public Clientes findById(Long id) {
        for (Clientes cliente : listaClientes) {
            if (cliente.getIdCliente() == id) {
                return cliente;
            }
        }
        return null;
    }

    // Metodo para Eliminar cliente por ID
    public boolean deleteById(Long id) {
        Clientes cliente = findById(id);
        if (cliente != null) {
            listaClientes.remove(cliente);
            return true;
        }
        return false;
    }    
    
}
