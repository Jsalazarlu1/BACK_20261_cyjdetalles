package com.cyjdetalles.backend.repository;

import com.cyjdetalles.backend.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
