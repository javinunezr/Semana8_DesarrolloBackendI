package com.duoc.RopaStoreValidation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.RopaStoreValidation.models.Pedidos;

@Repository
public interface PedidosRepository extends JpaRepository<Pedidos, Long> {

}
