
package com.example.demo.service;

import com.example.demo.usuario.Usuario;
import java.util.List;


public interface IUsuarioService {
    public void agregarUsuario(Usuario user);
    public List<Usuario> verUsuarios();
}
