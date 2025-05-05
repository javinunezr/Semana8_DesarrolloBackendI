package com.duoc.RopaStoreValidation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.duoc.RopaStoreValidation.models.Pedidos;
import com.duoc.RopaStoreValidation.services.PedidosService;

@RestController
@RequestMapping("/pedidos")
@CrossOrigin(origins = "*")

public class RestControllerPedidos {
    @Autowired
    private PedidosService pedidosService;

    @GetMapping
    public List<Pedidos> getAllPedidos() {
        return pedidosService.getAllPedidos();
    }

    @PostMapping("/cliente/{clienteId}")
    public ResponseEntity<Pedidos> createPedido(
            @PathVariable Long clienteId,
            @RequestBody Pedidos pedido) {

        Pedidos nuevoPedido = pedidosService.createPedido(clienteId, pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoPedido);
    }

    @PutMapping("/{id}")
    public Pedidos updatePedido(@PathVariable Long id, @RequestBody Pedidos pedidos) {
        return pedidosService.updatePedido(id, pedidos);
    }

    @GetMapping("/{id}")
    public Optional<Pedidos> getPedidoById(@PathVariable Long id) {
        return pedidosService.getPedidoById(id);
    }

    @DeleteMapping("/{id}")
    public void detelePedido(@PathVariable Long id) {
        pedidosService.detelePedido(id);
    }
}
