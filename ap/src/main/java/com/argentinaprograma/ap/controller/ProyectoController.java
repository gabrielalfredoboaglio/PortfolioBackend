package com.argentinaprograma.ap.controller;

import com.argentinaprograma.ap.models.Proyecto;

import com.argentinaprograma.ap.services.ProyectoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/proyecto")
public class ProyectoController {

    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }
    @PutMapping("/update")
    public ResponseEntity<Proyecto> editarProyecto(@RequestBody Proyecto proyecto){
        Proyecto updateProyecto=proyectoService.editarProyecto(proyecto);
        return new ResponseEntity<>(updateProyecto, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Proyecto>> obtenerProyecto(){
        List<Proyecto> proyecto=proyectoService.buscarProyectos();
        return new ResponseEntity<>(proyecto,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Proyecto> crearProyecto(@RequestBody Proyecto proyecto){
        Proyecto nuevaProyecto=proyectoService.addProyecto(proyecto);
        return new ResponseEntity<>(nuevaProyecto,HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarProyecto(@PathVariable("id") Long id){
        proyectoService.borrarProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
