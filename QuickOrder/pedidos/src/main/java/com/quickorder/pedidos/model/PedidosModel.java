package com.quickorder.pedidos.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "pedidos")
@Data
public class PedidosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cliente_id")
    private Integer clienteId;

    @Column(name = "fecha_pedido")
    private Date fechaPedido;

    private Integer total;

    private String estado;
}
