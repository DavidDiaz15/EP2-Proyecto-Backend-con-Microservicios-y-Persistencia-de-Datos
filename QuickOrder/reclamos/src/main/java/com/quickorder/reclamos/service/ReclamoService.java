package com.quickorder.reclamos.service;

import com.quickorder.reclamos.model.ReclamoModel;
import com.quickorder.reclamos.repository.ReclamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReclamoService {
    @Autowired
    private ReclamoRepository repository;

    public List<ReclamoModel> listarPorUsuario(Long usuarioId) {
        return repository.findByUsuarioId(usuarioId);
    }

    public ReclamoModel crear(ReclamoModel reclamo) {
        if (reclamo.getEstado() == null) reclamo.setEstado("Abierto");
        return repository.save(reclamo);
    }
}