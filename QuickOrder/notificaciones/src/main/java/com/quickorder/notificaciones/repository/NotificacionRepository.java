package com.quickorder.notificaciones.repository;

import com.quickorder.notificaciones.model.NotificacionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificacionRepository extends JpaRepository<NotificacionModel, Long> {

    List<NotificacionModel> findByUsuarioId(Long usuarioId);
}