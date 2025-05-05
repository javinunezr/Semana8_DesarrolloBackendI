package com.duoc.RopaStoreValidation.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.RopaStoreValidation.models.Pedidos;

@Repository
public interface PedidosRepository extends JpaRepository<Pedidos, Long> {
    // Metodo que traera todos los pedidos de un cliente segun su id
    // List<Pedidos> findByIdCliente(Long idCliente);
    List<Pedidos> findByClienteIdCliente(Long idCliente);

}
