package com.cyjdetalles.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity

@Table(name = "pedido")

public class Pedido {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long idPedido;

    @Column
    private Long idCliente;

    @Column
    private Long idEmpleado;

    @Column
    private LocalDate fechaCreacion;

    @Column
    private LocalDate fechaEntrega;

    @Column
    private String estado;

    @Column
    private Double total;


    public void setIdPedido(Long idPedido) {

    }
}
