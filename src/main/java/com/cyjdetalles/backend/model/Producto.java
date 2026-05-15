
//Esta clase es el modelo de datos para la tabla productos, esta clase se va a mapear a la tabla productos de la base de datos, y cada variable de esta clase se va a mapear a una columna de la tabla productos, con las anotaciones de JPA se le dice a la base de datos como se va a mapear esta clase a la tabla productos, y con las anotaciones de Lombok se le dice al compilador que genere los constructores, getters y setters de esta clase automaticamente, para no tener que escribirlos manualmente.
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
//con esta anotacion se le dice a la base de datos que esta clase se va a mapear a una tabla, y el nombre de la tabla es productos
@Table(name = "productos")
public class Producto {

    //con esta anotacion se le dice a la base de datos que esta variable es la clave primaria de la tabla, y que se va a generar automaticamente con un valor incremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   //Creando la columna nombre, con la anotacion @Column se le dice a la base de datos que esta variable se va a mapear a una columna de la tabla, y que no puede ser nula
    @Column(nullable = false)
    private String nombre;

    //creando la columna Categoria, con la anotacion @Column se le dice a la base de datos que esta variable se va a mapear a una columna de la tabla, y que no puede ser nula
    @Column(nullable = false)
    private String categoria;

    //la columna descripcion, con la anotacion @Column se le dice a la base de datos que esta variable se va a mapear a una columna de la tabla, y que no puede ser nula
    @Column(nullable = false)
    private String descripcion;

    //la columna precio, con la anotacion @Column se le dice a la base de datos que esta variable se va a mapear a una columna de la tabla, y que no puede ser nula
    @Column(nullable = false)
    private Double precio_unitario;


    //la columna cantidad, con la anotacion @Column se le dice a la base de datos que esta variable se va a mapear a una columna de la tabla, y que no puede ser nula
    @Column(nullable = false)
    private Integer stock;


}
