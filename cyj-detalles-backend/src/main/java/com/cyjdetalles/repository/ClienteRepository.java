package com.cyjdetalles.repository;

import com.cyjdetalles.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // Buscar cliente por número de documento
    Optional<Cliente> findByN_documento(Long n_documento);

    // Buscar cliente por email
    Optional<Cliente> findByEmail(String email);

    // Verificar si ya existe un cliente con ese documento
    boolean existsByN_documento(Long n_documento);

    // Verificar si ya existe un cliente con ese email
    boolean existsByEmail(String email);
}
