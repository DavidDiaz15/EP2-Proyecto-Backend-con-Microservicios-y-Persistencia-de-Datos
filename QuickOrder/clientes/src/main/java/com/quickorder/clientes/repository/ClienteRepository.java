package com.quickorder.clientes.repository;

import com.quickorder.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByAppaterno(String appaterno);

    void deleteByNombre(String nombre);
}