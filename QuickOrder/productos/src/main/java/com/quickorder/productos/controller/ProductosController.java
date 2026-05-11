package com.quickorder.productos.controller;

import com.quickorder.productos.model.Productos;
import com.quickorder.productos.service.ProductosService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductosController {

    @Autowired
    private ProductosService productosService;

    @GetMapping
    public ResponseEntity<List<Productos>> listar() {
        return ResponseEntity.ok(productosService.findAll());
    }

    @GetMapping(value = "buscar/{categoria}")
    public ResponseEntity<List<Productos>> buscarPorCategoria(@PathVariable String categoria) {
        return ResponseEntity.ok(productosService.buscarPorCategoria(categoria));
    }

    @PostMapping(value = "nuevo-producto")
    public ResponseEntity<Productos> crear(@Valid @RequestBody Productos producto) {
        Productos nuevoProducto = productosService.save(producto);
        return new ResponseEntity<>(nuevoProducto, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        productosService.delete(id);
        return ResponseEntity.noContent().build();
    }
}