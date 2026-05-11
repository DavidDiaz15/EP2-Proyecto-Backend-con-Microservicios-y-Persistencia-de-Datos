package com.quickorder.productos.respository;

import com.quickorder.productos.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Long> {

    List<Productos> findByCategoria(String categoria);
}