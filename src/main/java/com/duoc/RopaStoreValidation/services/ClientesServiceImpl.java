package com.duoc.RopaStoreValidation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.duoc.RopaStoreValidation.models.Clientes;
import com.duoc.RopaStoreValidation.repositories.ClientesRepository;

@Service
public class ClientesServiceImpl implements ClientesService {

    private ClientesRepository clientesRepository;

    @Autowired
    public ClientesServiceImpl(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    // Crea clientes
    @Override
    public void createCliente(Clientes clientes) {
        clientesRepository.save(clientes);
    }

    // Obtiene toda la lista de clientes
    @Override
    public List<Clientes> getAllClientes() {
        return clientesRepository.findAll();
    }

    // Obtiene el id de un cliente en particular
    @Override
    public Optional<Clientes> getClientesById(Long id) {
        return clientesRepository.findById(id);
    }

    // Actualiza un cliente
    @Override
    public Clientes updateCliente(Long id, Clientes clientes) {
        if (clientesRepository.existsById(id)) {
            clientes.setIdCliente(id);
            return clientesRepository.save(clientes);
        } else {
            return null;
        }
    }

    // Elimina un cliente
    @Override
    public void deleteCliente(Long id) {
        clientesRepository.deleteById(id);
    }

}
