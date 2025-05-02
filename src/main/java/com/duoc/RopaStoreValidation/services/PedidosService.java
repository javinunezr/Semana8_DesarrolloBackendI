package com.duoc.RopaStoreValidation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duoc.RopaStoreValidation.models.Pedidos;

@Service
public interface PedidosService {
    List<Pedidos> getAllPedidoList();
    List<Pedidos> listarPorIdPedidoMenorAMayor();
    void agregarAListaPedidos(Pedidos pedidos);    
    Pedidos findById(Long id); 
    boolean deleteById(Long id); 
}
