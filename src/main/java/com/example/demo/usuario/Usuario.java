
package com.example.demo.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Usuario {
    
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String nombre;
private String apellido;
private String titulo;
private String descripcion;
private String url_foto;
private String url_img;
private String email;
private String password;




public Usuario(){}

public Usuario(Long id, String nombre, String apellido, String titulo, String descripcion, String url_foto, String url_img, String email,String password){ 
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.url_foto = url_foto;
    this.url_img = url_img;
    this.email = email;
    this.password = password;
    
    
    
}
    
}
