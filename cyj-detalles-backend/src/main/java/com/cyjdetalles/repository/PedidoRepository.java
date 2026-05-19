package com.cyjdetalles.repository;

import com.cyjdetalles.model.Pedido;
import com.cyjdetalles.service.PedidoService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}