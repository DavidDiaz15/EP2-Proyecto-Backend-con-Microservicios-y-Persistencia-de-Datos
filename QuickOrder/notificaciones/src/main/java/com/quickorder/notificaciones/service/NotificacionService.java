package com.quickorder.notificaciones.service;

import com.quickorder.notificaciones.model.NotificacionModel;
import com.quickorder.notificaciones.repository.NotificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificacionService {

    @Autowired
    private NotificacionRepository repository;

    public List<NotificacionModel> listarPorUsuario(Long usuarioId) {
        return repository.findByUsuarioId(usuarioId);
    }

    public NotificacionModel guardar(NotificacionModel notificacion) {
        return repository.save(notificacion);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}