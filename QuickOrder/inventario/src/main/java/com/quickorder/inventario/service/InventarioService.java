package com.quickorder.inventario.service;

import com.quickorder.inventario.model.Inventario;
import com.quickorder.inventario.repository.InventarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    public List<Inventario> findAll(){
        return inventarioRepository.findAll();
    }

    public List<Inventario> buscarPorProducto(Long productoId){
        return inventarioRepository.findByProductoId(productoId);
    }

    public Inventario guardar(Inventario inventario){
        return inventarioRepository.save(inventario);
    }

    public void eliminar(Long id) {
        inventarioRepository.deleteById(id);
    }
}