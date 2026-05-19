//el archivo del servicio de productos, en este archivo se van a crear los servicios para la tabla productos, con las anotaciones de Spring se le dice a la base de datos como se va a mapear esta clase a la tabla productos, y
// con las anotaciones de Lombok se le dice al compilador que genere los constructores,
// getters y setters de esta clase automaticamente, para no tener que escribirlos manualmente.
package com.cyjdetalles.backend.service;

import com.cyjdetalles.backend.model.Producto;
import com.cyjdetalles.backend.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    // Inyección del repositorio para acceder a la base de datos
    @Autowired
    private ProductoRepository productoRepository;

    //creamos los metodos
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    // Guardar un nuevo producto
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    //actualizar un producto por su id
    public Producto actualizar(Long id,  Producto producto) {
        producto.setId(id);
        return productoRepository.save(producto);
    }

    //eliminar un producto por su id
    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }


}
