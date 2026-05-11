package com.quickorder.detalle_pedido.controller;

import com.quickorder.detalle_pedido.model.DetallePedidoModel;
import com.quickorder.detalle_pedido.service.DetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/detalles-pedidos")
public class DetallePedidoController {

    @Autowired
    private DetallePedidoService service;

    @GetMapping
    public ResponseEntity<List<DetallePedidoModel>> listarTodo() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/pedido/{pedidoId}")
    public ResponseEntity<List<DetallePedidoModel>> listarPorPedido(@PathVariable Long pedidoId) {
        List<DetallePedidoModel> detalles = service.buscarPorPedido(pedidoId);
        return detalles.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(detalles);
    }

    @PostMapping
    public ResponseEntity<DetallePedidoModel> crear(@RequestBody DetallePedidoModel detalle) {
        return new ResponseEntity<>(service.guardar(detalle), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}