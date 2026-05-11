package com.quickorder.pedidos.service;

import com.quickorder.pedidos.model.PedidosModel;
import com.quickorder.pedidos.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidosService {

    @Autowired
    private PedidosRepository pedidosRepository;

    public List<PedidosModel> listarTodos() {
        return pedidosRepository.findAll();
    }

    public PedidosModel guardar(PedidosModel pedido) {
        return pedidosRepository.save(pedido);
    }

    public List<PedidosModel> listarPorCliente(Long clienteId) {
        return pedidosRepository.findByClienteId(clienteId);
    }
}