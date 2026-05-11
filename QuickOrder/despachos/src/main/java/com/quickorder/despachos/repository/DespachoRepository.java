package com.quickorder.despachos.repository;

import com.quickorder.despachos.model.DespachoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface DespachoRepository extends JpaRepository<DespachoModel, Long> {
    Optional<DespachoModel> findByPedidoId(Long pedidoId);
}