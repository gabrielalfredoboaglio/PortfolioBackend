package com.argentinaprograma.ap.security;

import com.argentinaprograma.ap.models.Usuario;
import com.argentinaprograma.ap.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {


    @Autowired
    private UsuarioRepo usuarioRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
      Usuario usuario = usuarioRepo
                .findOneByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario con email "+ email + " no existe."));

                return new UserDetailsImp(usuario);
    }
}
