package com.cursojava.curso.controllers;


import com.cursojava.curso.models.Usuarios;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UsuariosController {

@RequestMapping(value = "prueba")
     public Usuarios getUsuarios() {
     Usuarios usuario = new Usuarios();
     usuario.setNombre("Romulo");
     usuario.setApellido("Car");
     usuario.setEmail("romulo.castro");
     usuario.setTelefono("romulo");
     usuario.setPassword("carlos");
     return usuario;
}


}
