package com.cyjdetalles.backend.repository;

import com.cyjdetalles.backend.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
