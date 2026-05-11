package com.quickorder.detalle_pedido.service;

import com.quickorder.detalle_pedido.model.DetallePedidoModel;
import com.quickorder.detalle_pedido.repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DetallePedidoService {

    @Autowired
    private DetallePedidoRepository repository;

    public List<DetallePedidoModel> listarTodos() {
        return repository.findAll();
    }

    public List<DetallePedidoModel> buscarPorPedido(Long pedidoId) {
        return repository.findByPedidoId(pedidoId);
    }

    public DetallePedidoModel guardar(DetallePedidoModel detalle) {
        return repository.save(detalle);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}