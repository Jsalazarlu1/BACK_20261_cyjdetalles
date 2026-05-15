package com.cyjdetalles.backend.service;


import com.cyjdetalles.backend.model.Usuario;
import com.cyjdetalles.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

     // Creamos los metodos
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    //Guardamos un nuevo usuario
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    //actualizamos un usuario por su id
    public Usuario actualizar(Long id,  Usuario usuario) {
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    //eliminar un usuario por su id
    public void eliminar(Long id) {
        usuarioRepository.deleteById(id);
    }

}
