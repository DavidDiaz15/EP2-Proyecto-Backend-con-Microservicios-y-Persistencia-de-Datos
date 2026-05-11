package com.quickorder.pagos.service;

import com.quickorder.pagos.model.PagosModel;
import com.quickorder.pagos.repository.PagosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagosService {

    @Autowired
    private PagosRepository repository;

    public PagosModel registrarPago(PagosModel pago){
        if (pago.getEstadoPago() == null) pago.setEstadoPago("APROBADO");
        return repository.save(pago);
    }

    public java.util.Optional<PagosModel> obtenerPorPedido(Long pedidoId){
        return repository.findByPedidoId(pedidoId);
    }
}