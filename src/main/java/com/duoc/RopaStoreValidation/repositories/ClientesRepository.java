package com.duoc.RopaStoreValidation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duoc.RopaStoreValidation.models.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long>{
    
}
