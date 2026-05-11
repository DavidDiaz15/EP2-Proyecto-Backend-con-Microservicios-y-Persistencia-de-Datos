package com.quickorder.notificaciones.controller;

import com.quickorder.notificaciones.model.NotificacionModel;
import com.quickorder.notificaciones.service.NotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notificaciones")
public class NotificacionController {

    @Autowired
    private NotificacionService service;

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<NotificacionModel>> obtenerPorUsuario(@PathVariable Long usuarioId) {
        List<NotificacionModel> notificaciones = service.listarPorUsuario(usuarioId);
        return notificaciones.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(notificaciones);
    }

    @PostMapping
    public ResponseEntity<NotificacionModel> crear(@RequestBody NotificacionModel notificacion) {
        return new ResponseEntity<>(service.guardar(notificacion), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}