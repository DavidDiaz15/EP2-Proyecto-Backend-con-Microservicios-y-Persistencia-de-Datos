package com.quickorder.clientes.service;


import com.quickorder.clientes.model.Cliente;
import com.quickorder.clientes.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public List<Cliente> buscarPorApellidoPaterno(String apellido){
        return clienteRepository.findByAppaterno(apellido);
    }

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void delete(String nombre){
        clienteRepository.deleteByNombre(nombre);
    }
}
