package com.cyjdetalles.backend.model;


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

@Table(name = "detalle_pedido")
public class DetallePedido {
    @Id
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer cantidad;

    @Column
    private Double precioUnitario;

    @Column
    private Double total;

    //la relacion entre detalle pedido y pedido
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    //la relacion entre detalle pedido y producto
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
}
