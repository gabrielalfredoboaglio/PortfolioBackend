package com.argentinaprograma.ap.repository;

import com.argentinaprograma.ap.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepo extends JpaRepository <Usuario,Long>{

    Optional<Usuario> findOneByEmail(String email);
}
