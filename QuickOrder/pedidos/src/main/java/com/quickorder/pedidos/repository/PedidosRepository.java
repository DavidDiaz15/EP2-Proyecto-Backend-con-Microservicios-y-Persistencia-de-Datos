package com.quickorder.pedidos.repository;

import com.quickorder.pedidos.model.PedidosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidosRepository extends JpaRepository<PedidosModel, Long> {

    List<PedidosModel> findByClienteId(Long clienteId);
}