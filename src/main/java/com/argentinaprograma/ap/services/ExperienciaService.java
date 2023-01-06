package com.argentinaprograma.ap.services;

import com.argentinaprograma.ap.models.Experiencia;
import com.argentinaprograma.ap.repository.ExperienciaRepo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienciaService {

    private final ExperienciaRepo experienciaRepo;


    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }
public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
}
    public List<Experiencia> buscarExperiencias(){
        return experienciaRepo.findAll();
    }
    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
}