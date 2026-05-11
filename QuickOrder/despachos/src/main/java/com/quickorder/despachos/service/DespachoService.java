package com.quickorder.despachos.service;

import com.quickorder.despachos.model.DespachoModel;
import com.quickorder.despachos.repository.DespachoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class DespachoService {
    @Autowired
    private DespachoRepository repository;

    public DespachoModel crearDespacho(DespachoModel despacho) {
        if (despacho.getEstadoDespacho() == null) despacho.setEstadoDespacho("PREPARACION");
        return repository.save(despacho);
    }

    public Optional<DespachoModel> obtenerPorPedido(Long pedidoId) {
        return repository.findByPedidoId(pedidoId);
    }
}