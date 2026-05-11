package com.quickorder.reclamos.controller;

import com.quickorder.reclamos.model.ReclamoModel;
import com.quickorder.reclamos.service.ReclamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/reclamos")
public class ReclamoController {
    @Autowired
    private ReclamoService service;

    @PostMapping
    public ResponseEntity<ReclamoModel> registrar(@RequestBody ReclamoModel reclamo) {
        return ResponseEntity.ok(service.crear(reclamo));
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<ReclamoModel>> buscarPorUsuario(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(service.listarPorUsuario(usuarioId));
    }
}