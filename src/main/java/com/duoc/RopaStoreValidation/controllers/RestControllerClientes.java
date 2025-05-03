package com.duoc.RopaStoreValidation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.duoc.RopaStoreValidation.models.Clientes;
import com.duoc.RopaStoreValidation.services.ClientesService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")


public class RestControllerClientes {
    @Autowired
    private ClientesService clientesService;

    @GetMapping
    public List<Clientes> getAllClientes(){
        return clientesService.getAllClientes();
    }

    @PostMapping
    public Clientes createCliente(@RequestBody Clientes clientes) {
        return clientesService.createCliente(clientes);
    }
    
    @PutMapping("/{id}")
    public Clientes updateCliente(@PathVariable Long id, @RequestBody Clientes clientes) {
        return clientesService.updateCliente(id, clientes);
    }
        
    @GetMapping("/{id}")
    public Optional<Clientes> getClientesById(@PathVariable Long id) {
        return clientesService.getClientesById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id){
        clientesService.deleteCliente(id);
    }
}
