package com.argentinaprograma.ap.controller;

import com.argentinaprograma.ap.models.Usuario;
import com.argentinaprograma.ap.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuario")

public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id")Long id){
        Usuario usuario = usuarioService.buscarUsuarioPorID(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
        Usuario updateUsuario=usuarioService.editarUsuario(usuario);
        return new ResponseEntity<>(updateUsuario,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario){
Usuario newuser= usuarioService.addUser(usuario.getNombre(), usuario.getEmail(), usuario.getPassword());
return new ResponseEntity<>(newuser, HttpStatus.CREATED);
    }

      }
