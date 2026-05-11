package com.quickorder.inventario.controller;

import com.quickorder.inventario.model.Inventario;
import com.quickorder.inventario.service.InventarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @GetMapping
    public ResponseEntity<List<Inventario>> listarTodo() {
        return ResponseEntity.ok(inventarioService.findAll());
    }

    @GetMapping("/producto/{productoId}")
    public ResponseEntity<List<Inventario>> buscarPorProducto(@PathVariable Long productoId) {
        List<Inventario> resultados = inventarioService.buscarPorProducto(productoId);
        if (resultados.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(resultados);
    }

    @PostMapping
    public ResponseEntity<Inventario> guardar(@Valid @RequestBody Inventario inventario) {
        Inventario nuevoInventario = inventarioService.guardar(inventario);
        return new ResponseEntity<>(nuevoInventario, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        inventarioService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}