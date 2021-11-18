package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.UsuarioModel;
import com.example.demo.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel crearUsuario(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.guardarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public UsuarioModel actualizarUsuario(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Optional<UsuarioModel> obtenerUsuario(@PathVariable Long id) {
        return this.usuarioService.obtenerUsuario(id);
    }

    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuariosQuery(@RequestParam("prioridad") Integer prioridad) {
        return this.usuarioService.obtenerUsuariosPorPrioridad(prioridad);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable("id") Long id) {
        this.usuarioService.eliminarUsuario(id);
    }
}
