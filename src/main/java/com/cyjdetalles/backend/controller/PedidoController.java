package com.cyjdetalles.backend.controller;


import com.cyjdetalles.backend.model.Pedido;
import com.cyjdetalles.backend.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")

public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    // los HTTP GET, POST, PUT y DELETE para manejar las operaciones CRUD (Crear, Leer, Actualizar, Eliminar)

    @GetMapping
    public List<Pedido> getAllPedidos() {
        return pedidoService.getAllPedidos();
    }

   @PostMapping
    public Pedido guardar( @RequestBody Pedido pedido) {
        return pedidoService.guardar(pedido);
    }

    @PutMapping("/{id}")
    public Pedido actualizar(@PathVariable Long id, @RequestBody Pedido pedido) {
        return pedidoService.actualizar(id, pedido);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        pedidoService.eliminar(id);
    }

}
