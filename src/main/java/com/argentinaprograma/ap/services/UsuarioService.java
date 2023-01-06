package com.argentinaprograma.ap.services;

import com.argentinaprograma.ap.exception.UserNotFoundException;
import com.argentinaprograma.ap.models.Usuario;
import com.argentinaprograma.ap.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class UsuarioService {
    private  final UsuarioRepo usuarioRepo;
@Autowired
    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    public Usuario addUser(Usuario usuario){
        return  usuarioRepo.save(usuario);
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

