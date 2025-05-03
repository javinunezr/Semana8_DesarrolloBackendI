package com.duoc.RopaStoreValidation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.duoc.RopaStoreValidation.models.Clientes;

public interface ClientesService {
    List<Clientes> getAllClientes();
    Clientes createCliente(Clientes clientes);    
    Clientes updateCliente(Long id, Clientes clientes);
    Optional<Clientes> getClientesById(Long id); 
    void deleteCliente(Long id);    
}
