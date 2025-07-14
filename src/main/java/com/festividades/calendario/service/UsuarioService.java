package com.festividades.calendario.service;

import com.festividades.calendario.model.Usuario;
import com.festividades.calendario.repository.UsuarioRepository;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public Optional<Usuario> autenticarUsuario(String email, String password) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findByEmail(email);
        log.info("error");
        if (usuarioOpt.isPresent()) {
             log.info("error1");
            Usuario usuario = usuarioOpt.get();
             log.info("error9");
            if (passwordEncoder.matches(password, usuario.getPassword())) {
                 log.info("error2");
                return Optional.of(usuario);
            }
        }
         log.info("error3");
        return Optional.empty();
    }

    public Usuario guardarUsuario(Usuario usuario) {

        Optional<Usuario> usuarioOpt = usuarioRepository.findByEmail(usuario.getEmail());

        if(usuarioOpt.isPresent()){
            log.info("El usuario ya exite");
            return usuarioOpt.get();
        }

        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return usuarioRepository.save(usuario);
    }
}
