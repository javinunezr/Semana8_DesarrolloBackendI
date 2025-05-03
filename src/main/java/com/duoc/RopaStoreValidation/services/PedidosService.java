package com.duoc.RopaStoreValidation.services;

import java.util.List;
import java.util.Optional;
import com.duoc.RopaStoreValidation.models.Pedidos;

@Service
public interface PedidosService {
    List<Pedidos> getAllPedidos();
    Pedidos createPedido(Pedidos pedidos);   
    Pedidos updatePedido(Long id, Pedidos pedidos); 
    Optional<Pedidos> getPedidoById(Long id); 
    void detelePedido(Long id); 
}
