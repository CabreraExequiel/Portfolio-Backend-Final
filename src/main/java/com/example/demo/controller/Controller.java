package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IUsuarioService;
import com.example.demo.usuario.Usuario;

@RestController

public class Controller {

    @Autowired
   private IUsuarioService userService;
    

   @PostMapping("/nuevo/usuario")
   public void agregarUsuario(@RequestBody Usuario user){
       userService.agregarUsuario(user);



   }
   @GetMapping("/ver/usuario")
   @ResponseBody
   
   public List<Usuario> verUsuarios(){
       return userService.verUsuarios();
   }
}