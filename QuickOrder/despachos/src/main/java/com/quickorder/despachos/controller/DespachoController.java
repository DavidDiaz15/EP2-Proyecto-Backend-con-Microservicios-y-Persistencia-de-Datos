package com.quickorder.despachos.controller;

import com.quickorder.despachos.model.DespachoModel;
import com.quickorder.despachos.service.DespachoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/despachos")
public class DespachoController {
    @Autowired
    private DespachoService service;

    @PostMapping
    public ResponseEntity<DespachoModel> crear(@RequestBody DespachoModel despacho) {
        return ResponseEntity.ok(service.crearDespacho(despacho));
    }

    @GetMapping("/pedido/{pedidoId}")
    public ResponseEntity<DespachoModel> buscarPorPedido(@PathVariable Long pedidoId) {
        return service.obtenerPorPedido(pedidoId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}