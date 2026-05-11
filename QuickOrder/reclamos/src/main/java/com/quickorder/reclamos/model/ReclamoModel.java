package com.quickorder.reclamos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "reclamos")
@Data
public class ReclamoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario_id")
    private Long usuarioId;

    @Column(name = "pedido_id")
    private Long pedidoId;
    private String descripcion;
    private String estado;
}