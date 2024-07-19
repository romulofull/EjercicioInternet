package com.cursojava.curso.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosController {
@RequestMapping(value = "prueba")
     public String prueba() {
     return "Voy probando 2";
}

}
