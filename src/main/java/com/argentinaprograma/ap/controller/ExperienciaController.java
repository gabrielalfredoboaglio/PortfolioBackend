package com.argentinaprograma.ap.controller;


import com.argentinaprograma.ap.models.Experiencia;
import com.argentinaprograma.ap.services.ExperienciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/experiencia")
@CrossOrigin(origins = "https://frontend-ang.web.app/index")
public class ExperienciaController {
    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }
    @PutMapping("/update")
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia=experienciaService.editarExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> obtenerExperiencia(){
        List<Experiencia> experiencias=experienciaService.buscarExperiencias();
        return new ResponseEntity<>(experiencias,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia){
        Experiencia nuevaExperiencia=experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(nuevaExperiencia,HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("id") Long id){
        experienciaService.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
