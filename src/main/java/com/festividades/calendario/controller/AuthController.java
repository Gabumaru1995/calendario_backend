package com.festividades.calendario.controller;

import com.festividades.calendario.config.JwtUtil;
import com.festividades.calendario.model.Usuario;
//import com.festividades.calendario.model.Usuario;
import com.festividades.calendario.service.UsuarioService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
@Slf4j
public class AuthController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> loginData) {
        String email = loginData.get("email");
        String password = loginData.get("password");

        return usuarioService.autenticarUsuario(email, password)
                .map(usuario -> {
                    String token = jwtUtil.generateToken(email);
                    Map<String, Object> response = new HashMap<>();
                    response.put("token", token);
                    response.put("usuario", usuario);
                    return ResponseEntity.ok(response);
                })
                .orElseGet(() -> {
                    Map<String, Object> error = new HashMap<>();
                    error.put("message", "Credenciales inválidas");
                    return ResponseEntity.status(401).body(error);
                });
    }

    @PostMapping("/crear")
    public ResponseEntity<?> crear(@RequestBody Map<String, String> loginData) {

        log.info("asdasradsasd");
        Usuario usuario = new Usuario();
        usuario.setEmail(loginData.get("email"));
        usuario.setPassword(loginData.get("password"));
        usuario.setNombre(loginData.get("nombre"));
        
        Usuario usuarioCreado = usuarioService.guardarUsuario(usuario);

        if(usuario == null){
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

        return  ResponseEntity.ok(usuarioCreado);
    }

}
