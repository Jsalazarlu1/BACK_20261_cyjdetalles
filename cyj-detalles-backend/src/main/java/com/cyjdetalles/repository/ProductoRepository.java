package com.cyjdetalles.repository;

import com.cyjdetalles.model.Producto;
import com.cyjdetalles.service.ProductoService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository <Producto, Long> {
}
