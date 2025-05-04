package com.duoc.RopaStoreValidation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.RopaStoreValidation.models.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}
