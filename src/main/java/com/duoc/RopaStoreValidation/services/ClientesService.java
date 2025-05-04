package com.duoc.RopaStoreValidation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.duoc.RopaStoreValidation.models.Clientes;

@Service
public interface ClientesService {
    public void createCliente(Clientes clientes);

    public List<Clientes> getAllClientes();

    public Optional<Clientes> getClientesById(Long id);

    public Clientes updateCliente(Long id, Clientes clientes);

    public void deleteCliente(Long id);
}
