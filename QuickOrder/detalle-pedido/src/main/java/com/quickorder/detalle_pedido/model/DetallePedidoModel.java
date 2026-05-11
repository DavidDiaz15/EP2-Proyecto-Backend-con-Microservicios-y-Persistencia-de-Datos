package com.quickorder.detalle_pedido.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "detalle_pedidos")
@Data
public class DetallePedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pedido_id")
    private Long pedidoId;

    @Column(name = "producto_id")
    private Long productoId;

    private Integer cantidad;

    @Column(name = "precio_unitario")
    private Integer precioUnitario;
}