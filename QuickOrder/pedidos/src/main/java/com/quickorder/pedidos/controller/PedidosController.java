package com.quickorder.pedidos.controller;

import com.quickorder.pedidos.model.PedidosModel;
import com.quickorder.pedidos.service.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidosController {

    @Autowired
    private PedidosService pedidosService;

    @GetMapping
    public ResponseEntity<List<PedidosModel>> listar() {
        return ResponseEntity.ok(pedidosService.listarTodos());
    }

    @PostMapping
    public ResponseEntity<PedidosModel> crear(@RequestBody PedidosModel pedido) {
        return new ResponseEntity<>(pedidosService.guardar(pedido), HttpStatus.CREATED);
    }
}