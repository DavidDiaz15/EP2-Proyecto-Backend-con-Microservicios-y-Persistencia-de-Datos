package com.quickorder.pagos.repository;

import com.quickorder.pagos.model.PagosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagosRepository extends JpaRepository<PagosModel, Long>{

    java.util.Optional<PagosModel> findByPedidoId(Long pedidoId);
}