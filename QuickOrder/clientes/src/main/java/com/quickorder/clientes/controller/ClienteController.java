package com.quickorder.clientes.controller;
import com.quickorder.clientes.model.Cliente;
import com.quickorder.clientes.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> listar(){
        return ResponseEntity.ok(clienteService.findAll());
    }

    @GetMapping(value = "buscar/{apellido}")
    public ResponseEntity<List<Cliente>> buscarPorApellido(@PathVariable String apellido){
        return ResponseEntity.ok(clienteService.buscarPorApellidoPaterno(apellido));
    }

    @PostMapping(value = "nuevo-cliente")
    public ResponseEntity<Cliente> crear(@Valid @RequestBody Cliente cliente){
        Cliente nuevoCliente = clienteService.save(cliente);
        return new ResponseEntity<>(nuevoCliente, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "{nombre}")
    public ResponseEntity<Void> eliminar(@PathVariable String nombre){
        clienteService.delete(nombre);
        return ResponseEntity.noContent().build();
    }

}
