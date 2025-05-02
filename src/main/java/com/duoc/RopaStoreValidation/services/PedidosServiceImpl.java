package com.duoc.RopaStoreValidation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duoc.RopaStoreValidation.models.Pedidos;
import com.duoc.RopaStoreValidation.repositories.PedidosRepository;

@Service
public class PedidosServiceImpl {
    private final PedidosRepository pedidosRepository = new PedidosRepository();

    @Override
    public List<Pedidos> getAllPedidos() {
        return pedidosRepository.findAll();
    }

    @Override
    public List<Pedidos> listarPorIdPedidoMenorAMayor() {
        return pedidosRepository.listarPorIdPedidoMenorAMayor();
    }

    @Override
    public void agregarAListaPedidos(Pedidos pedidos) {
        pedidosRepository.agregarAListaPedidos(pedidos);
    }

    @Override
    public Pedidos findById(Long id) {
        return pedidosRepository.findById(id);
    }

    @Override
    public boolean deleteById(Long id) {
        return pedidosRepository.deleteById(id);
    }
}
