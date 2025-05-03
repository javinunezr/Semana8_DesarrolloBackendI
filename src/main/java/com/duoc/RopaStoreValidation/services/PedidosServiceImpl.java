package com.duoc.RopaStoreValidation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.duoc.RopaStoreValidation.models.Pedidos;
import com.duoc.RopaStoreValidation.repositories.PedidosRepository;

@Service
public class PedidosServiceImpl implements PedidosService{
    @Autowired
    private PedidosRepository pedidosRepository;

    @Override
    public List<Pedidos> getAllPedidos() {
        return pedidosRepository.findAll();
    }

    @Override
    public Pedidos createPedido(Pedidos pedidos) {
        pedidosRepository.save(pedidos);
    }

    @Override
    public Pedidos updatePedido(Long id, Pedidos pedidos){
        if(pedidostRepository.existsById(id)){
            pedidos.setId(id);
            return pedidosRepository.save(pedidos);
        }   else {
                return null;
        }
    }

    @Override
    public Optional<Pedidos> getPedidoById(Long id) {
        return pedidosRepository.findById(id);
    }

    @Override
    public void detelePedido(Long id) {
        pedidosRepository.deleteById(id);
    }
}
