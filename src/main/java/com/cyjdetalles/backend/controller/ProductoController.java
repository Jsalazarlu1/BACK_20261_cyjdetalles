//esto es un controlador de Spring Boot para manejar las solicitudes relacionadas con los productos en la aplicación.

package com.cyjdetalles.backend.controller;

import com.cyjdetalles.backend.model.Producto;
import com.cyjdetalles.backend.repository.ProductoRepository;
import com.cyjdetalles.backend.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//esto  recibe peticiones HTTP y devuelve datos JSON
@RestController

//esto define la base del url para comunicacion con el http://localhost:8080/api/productos
@RequestMapping("/api/productos")

public class ProductoController {
    // Inyección del repositorio para acceder a la base de datos
    @Autowired
    private ProductoService productoService;

    //esto es un metodo que recibe una solicitud GET a la ruta /api/productos y devuelve una lista de productos en formato JSON
    @GetMapping
    public List<Producto> getAllProductos() {

        return productoService.getAllProductos();
    }

    //guardar un nuevo producto
    //esto es un metodo que recibe una solicitud POST a la ruta /api/productos
    @PostMapping
    public Producto guardar(@RequestBody Producto producto) {

        return productoService.guardar(producto);
    }

    //los metodos para actualizar y eliminar un producto por su id
    //esto es un metodo que recibe una solicitud PUT a la ruta /api/productos/{id} y actualiza el producto con el id especificado
    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Long id, @RequestBody Producto producto) {
        return productoService.actualizar(id, producto);
    }


    //metodo para eliminar un producto por su id
    //esto es un metodo que recibe una solicitud DELETE a la ruta /api/productos/{id} y elimina el producto con el id especificado
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {

        productoService.eliminar(id);
    }




}
