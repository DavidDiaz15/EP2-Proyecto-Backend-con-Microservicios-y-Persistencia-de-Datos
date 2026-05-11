package com.quickorder.reclamos.repository;

import com.quickorder.reclamos.model.ReclamoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReclamoRepository extends JpaRepository<ReclamoModel, Long> {

    List<ReclamoModel> findByUsuarioId(Long usuarioId);
}