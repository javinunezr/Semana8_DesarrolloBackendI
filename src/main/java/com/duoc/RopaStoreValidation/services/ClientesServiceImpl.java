package com.duoc.RopaStoreValidation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.duoc.RopaStoreValidation.models.Clientes;
import com.duoc.RopaStoreValidation.repositories.ClientesRepository;

@Service
public class ClientesServiceImpl implements ClientesService {
    @Autowired
    private ClientesRepository clientesRepository;

    @Override
    public List<Clientes> getAllClientes() {
        return clientesRepository.findAll();
    }

    @Override
    public Clientes createCliente(Clientes clientes) {
        return clientesRepository.save(clientes);
    }

    @Override
    public Clientes updateCliente(Long id, Clientes clientes){
        if(clientesRepository.existsById(id)){
            clientes.setIdCliente(id);
            return clientesRepository.save(clientes);
        }   else {
                return null;
        }
    }

    @Override
    public Optional<Clientes> getClientesById(Long id) {
        return clientesRepository.findById(id);
    }

    @Override
    public void deleteCliente(Long id) {
        clientesRepository.deleteById(id);
    }
}
