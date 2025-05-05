package com.duoc.RopaStoreValidation.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.RopaStoreValidation.models.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Long> {
    List<Productos> findBySucursalId(Long sucursalId);
}
