package com.cyjdetalles.backend.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity

@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime fechaPedido;

    @Column
    private String estado;

    @Column
    private Double total;

    //la relacion entre pedido y cliente

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    //la relacion entre pedido y usuario que es el vendedor
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;



}
