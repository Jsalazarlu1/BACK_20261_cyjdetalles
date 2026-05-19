package com.cyjdetalles.backend.service;


import com.cyjdetalles.backend.model.Pedido;
import com.cyjdetalles.backend.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }

    // Guardar un nuevo pedido
    public Pedido guardar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    //actualizar un pedido por su id
    public Pedido actualizar(Long id,  Pedido pedido) {
        pedido.setId(id);
        return pedidoRepository.save(pedido);
    }

    //eliminar un pedido por su id
    public void eliminar(Long id) {
        pedidoRepository.deleteById(id);
    }

}
