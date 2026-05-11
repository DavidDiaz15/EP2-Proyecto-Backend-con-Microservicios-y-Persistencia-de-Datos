package com.quickorder.notificaciones.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "notificaciones")
@Data
public class NotificacionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario_id")
    private Long usuarioId;

    private String mensaje;
}