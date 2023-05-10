
package com.example.demo.service;

import com.example.demo.repository.UsuarioRepository;
import com.example.demo.usuario.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    public UsuarioRepository userRepo;

    @Override
    public void agregarUsuario(Usuario user) {
        userRepo.save(user);
    }

    @Override
    public List<Usuario> verUsuarios() {
        return userRepo.findAll();
    }
    
    
    
    
}
