package com.argentinaprograma.ap.services;

import com.argentinaprograma.ap.exception.UserNotFoundException;
import com.argentinaprograma.ap.models.Usuario;
import com.argentinaprograma.ap.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service

public class UsuarioService {

    @Autowired
    private UsuarioRepo usuarioRepo;



    public Usuario addUser(String nombre, String email, String password) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return usuarioRepo.save(new Usuario(nombre, email, passwordEncoder.encode(password)));

    }


    public List<Usuario> buscarUsuario(){
        return usuarioRepo.findAll();

    }
    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    public  void borrarUsuario(Long id){
        usuarioRepo.deleteById(id);
    }
    public Usuario buscarUsuarioPorID(Long id){
    return usuarioRepo.findById(id).orElseThrow(()-> new UserNotFoundException("Usuario no encontrado"));
    }



}

