package com.cyjdetalles.backend.controller;


import com.cyjdetalles.backend.model.Usuario;
import com.cyjdetalles.backend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

     @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @PostMapping
    public Usuario guardar( @RequestBody Usuario usuario) {
        return usuarioService.guardar(usuario);
    }

     @PutMapping("/{id}")
    public Usuario actualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
         return usuarioService.actualizar(id, usuario);
     }

     @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
         usuarioService.eliminar(id);
     }

}
