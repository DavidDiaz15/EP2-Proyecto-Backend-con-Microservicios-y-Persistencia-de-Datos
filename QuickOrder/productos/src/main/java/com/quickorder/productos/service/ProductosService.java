package com.quickorder.productos.service;

import com.quickorder.productos.model.Productos;
import com.quickorder.productos.respository.ProductosRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductosService {

    @Autowired
    private ProductosRepository productosRepository;

    public List<Productos> findAll() {
        return productosRepository.findAll();
    }

    public List<Productos> buscarPorCategoria(String categoria) {
        return productosRepository.findByCategoria(categoria);
    }

    public Productos save(Productos producto) {
        return productosRepository.save(producto);
    }

    public void delete(Long id) {
        productosRepository.deleteById(id);
    }
}