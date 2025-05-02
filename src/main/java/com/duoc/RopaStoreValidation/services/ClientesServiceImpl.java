package com.duoc.RopaStoreValidation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duoc.RopaStoreValidation.models.Clientes;
import com.duoc.RopaStoreValidation.repositories.ClientesRepository;

@Service
public class ClientesServiceImpl {
    private final ClientesRepository clientesRepository = new ClientesRepository();

    @Override
    public List<Clientes> getAllClientes() {
        return clientesRepository.findAll();
    }

    @Override
    public List<Clientes> listarPorIdMenorAMayor() {
        return clientesRepository.listarPorIdMenorAMayor();
    }

    @Override
    public void agregarAListaCliente(Clientes clientes) {
        clientesRepository.agregarAListaCliente(clientes);
    }

    @Override
    public Clientes findById(Long id) {
        return clientesRepository.findById(id);
    }

    @Override
    public boolean deleteById(Long id) {
        return clientesRepository.deleteById(id);
    }

}
