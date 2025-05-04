package com.duoc.RopaStoreValidation.services;

import java.util.List;
import java.util.Optional;

import com.duoc.RopaStoreValidation.models.Pedidos;

public interface PedidosService {

    public List<Pedidos> getAllPedidos();

    public void createPedido(Pedidos pedidos);

    public Pedidos updatePedido(Long id, Pedidos pedidos);

    public Optional<Pedidos> getPedidoById(Long id);

    public void detelePedido(Long id);
}
