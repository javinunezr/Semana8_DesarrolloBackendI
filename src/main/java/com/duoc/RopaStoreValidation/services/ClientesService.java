package com.duoc.RopaStoreValidation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duoc.RopaStoreValidation.models.Clientes;

@Service
public interface ClientesService {
    static List<Clientes> getAllClientes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllClientes'");
    }
    List<Clientes> listarPorIdMenorAMayor();
    void agregarAListaCliente(Clientes clientes);    
    Clientes findById(Long id); 
    boolean deleteById(Long id);  
    
}
