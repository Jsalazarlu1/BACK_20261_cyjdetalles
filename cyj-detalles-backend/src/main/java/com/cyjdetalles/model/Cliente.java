package com.cyjdetalles.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    @Column(length = 10)
    private String ti_documento;

    private Long n_documento;

    @Column(length = 60)
    private String nombre;

    private Long telefono;

    @Column(length = 80)
    private String direccion;

    @Column(length = 80)
    private String email;

    private LocalDate fecha_registro;

    // GETTERS Y SETTERS

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getTi_documento() {
        return ti_documento;
    }

    public void setTi_documento(String ti_documento) {
        this.ti_documento = ti_documento;
    }

    public Long getN_documento() {
        return n_documento;
    }

    public void setN_documento(Long n_documento) {
        this.n_documento = n_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}