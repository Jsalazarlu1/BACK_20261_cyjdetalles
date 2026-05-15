package com.cyjdetalles.backend.repository;

import com.cyjdetalles.backend.model.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Long> {
}