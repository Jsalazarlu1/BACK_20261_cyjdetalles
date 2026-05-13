package com.cyjdetalles.backend.controller;



import com.cyjdetalles.backend.model.DetallePedido;
import com.cyjdetalles.backend.service.DetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallepedidos")

public class DetallePedidoController {

    @Autowired
    private DetallePedidoService detallePedidoService;

    @GetMapping
    public List<DetallePedido> getAllDetallePedidos() {
        return detallePedidoService.getAllDetallesPedido();
    }

    @PostMapping
    public DetallePedido guardar(@RequestBody DetallePedido detallePedido) {
        return detallePedidoService.guardar(detallePedido);
    }

    @PutMapping("/{id}")
    public DetallePedido actualizar(@PathVariable Long id, @RequestBody DetallePedido detallePedido) {
        return detallePedidoService.actualizar(id, detallePedido);
    }

    @DeleteMapping ("/{id}")
    public void eliminar(@PathVariable Long id) {
        detallePedidoService.eliminar(id);
    }
}
