package com.duoc.RopaStoreValidation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.duoc.RopaStoreValidation.models.Pedidos;
import com.duoc.RopaStoreValidation.repositories.PedidosRepository;

@Service
public class PedidosServiceImpl implements PedidosService {

    private PedidosRepository pedidosRepository;

    @Autowired
    public PedidosServiceImpl(PedidosRepository pedidosRepository) {
        this.pedidosRepository = pedidosRepository;
    }

    // Obtiene toda la lista de pedidos
    @Override
    public List<Pedidos> getAllPedidos() {
        return pedidosRepository.findAll();
    }

    // Crea un pedido
    @Override
    public void createPedido(Pedidos pedidos) {
        pedidosRepository.save(pedidos);
    }

    // Actualiza un pedido
    @Override
    public Pedidos updatePedido(Long id, Pedidos pedidos) {
        if (pedidosRepository.existsById(id)) {
            pedidos.setIdPedido(id);
            return pedidosRepository.save(pedidos);
        } else {
            return null;
        }
    }

    // Busca un pedido por id
    @Override
    public Optional<Pedidos> getPedidoById(Long id) {
        return pedidosRepository.findById(id);
    }

    // Elimina un pedido por id
    @Override
    public void detelePedido(Long id) {
        pedidosRepository.deleteById(id);
    }
}
