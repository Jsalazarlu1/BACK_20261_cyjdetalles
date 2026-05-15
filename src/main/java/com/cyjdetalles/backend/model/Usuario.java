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

    @Table(name = "usuarios")
    public class Usuario {

        @Id
        @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true)
        private String nombreUsuario;

        @Column(nullable = false, unique = false)
        private String contrasena;


        @Column(nullable = false)
        private String rol;

        @Column(nullable = false)
        private Boolean activo;

    }
