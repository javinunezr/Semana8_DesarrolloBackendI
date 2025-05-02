package com.duoc.RopaStoreValidation.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.RopaStoreValidation.models.Clientes;
import com.duoc.RopaStoreValidation.services.ClientesService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor


public class RestControllerClientes {
    
    private final ClientesService clientesService;

    @GetMapping // Consultar todos los clientes
    public ResponseEntity<List<Clientes>> listarClientes() {
        List<Clientes> listaclientes = ClientesService.getAllClientes();
        if (listaclientes.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listaclientes);
    }


    @GetMapping("/{rut}") // Consultar cliente por Rut
    public ResponseEntity<List<Clientes>> listarClientes(@PathVariable String rutCliente) {
        List<Clientes> listaclientes = ClientesService.findByrutCliente(rutCliente);
        if (listaclientes.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listaclientes);
    }


    @PostMapping // Agregar cliente
    public ResponseEntity<Void> agregarAListaCliente(@RequestBody Clientes listaclientes) {
        ClientesService.agregarAListaCliente(listacliente);
        return ResponseEntity.status(201).build();
    }



    // FALTA CREAR "MODIFICAR CLIENTE"

    

    @DeleteMapping("/{rut}") // Eliminar cliente por RUT
    public ResponseEntity<String> eliminarCliente(@PathVariable String rutCliente) {
        Clientes listaclientes = ClientesService.findByrutCliente(rutCliente);

        if (listaclientes != null) {
            ClientesService.deleteByrutCliente(rutCliente);
            return ResponseEntity.ok("Cliente eliminado exitosamente.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                             .body("Cliente no encontrado con RUT: " + rutCliente);
        }
    }



}
