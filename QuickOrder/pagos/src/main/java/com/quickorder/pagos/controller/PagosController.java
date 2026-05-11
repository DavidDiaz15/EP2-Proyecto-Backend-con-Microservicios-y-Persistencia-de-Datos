package com.quickorder.pagos.controller;

import com.quickorder.pagos.model.PagosModel;
import com.quickorder.pagos.service.PagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/pagos")
public class PagosController{
    @Autowired
    private PagosService service;

    @PostMapping
    public ResponseEntity<PagosModel> pagar(@RequestBody PagosModel pago) {
        return ResponseEntity.ok(service.registrarPago(pago));
    }

    @GetMapping("/pedido/{pedidoId}")
    public ResponseEntity<PagosModel> verPago(@PathVariable Long pedidoId) {
        return service.obtenerPorPedido(pedidoId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}