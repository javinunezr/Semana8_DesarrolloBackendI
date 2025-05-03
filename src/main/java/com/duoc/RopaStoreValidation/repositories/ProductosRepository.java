package com.duoc.RopaStoreValidation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duoc.RopaStoreValidation.models.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Long>{
    
}
