package com.cyjdetalles.backend.service;


import com.cyjdetalles.backend.model.Cliente;
import com.cyjdetalles.backend.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //creamos los metodos
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();

    }
    // Guardar un nuevo cliente
    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }


    //actualizar un cliente por su id
    public Cliente actualizar(Long id,  Cliente cliente) {
        cliente.setId(id);
        return clienteRepository.save(cliente);
    }

    //eliminar un cliente por su id
    public void eliminar(Long id) {
        clienteRepository.deleteById(id);
    }
}
