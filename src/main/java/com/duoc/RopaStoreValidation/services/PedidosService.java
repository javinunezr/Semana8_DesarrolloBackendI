package com.duoc.RopaStoreValidation.services;

import java.util.List;
import java.util.Optional;

import com.duoc.RopaStoreValidation.models.Pedidos;

public interface PedidosService {

    public List<Pedidos> getAllPedidos();

    public Pedidos createPedido(Long clienteId, Pedidos pedido);

    public Pedidos updatePedido(Long id, Pedidos pedidos);

    public Optional<Pedidos> getPedidoById(Long id);

    public void detelePedido(Long id);

    // Metodo creado en repository para traer todos los pedidos de un cliente segun
    // id
    List<Pedidos> getPedidosByClienteId(Long idCliente);
}
