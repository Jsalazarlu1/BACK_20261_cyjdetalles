package com.cyjdetalles.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity

@Table(name = "producto")

public class Producto {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String categoria;

    @Column
    private String descripcion;

    @Column
    private Double precioUnitario;

    @Column
    private Integer stock;


    public void setId(Long id) {

    }
}
