package com.quickorder.despachos.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "despachos")
@Data
public class DespachoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pedido_id")
    private Long pedidoId;

    private String direccion;
    private String comuna;

    @Column(name = "estado_despacho")
    private String estadoDespacho;

    @Column(name = "fecha_estimada")
    private LocalDate fechaEstimada;
}