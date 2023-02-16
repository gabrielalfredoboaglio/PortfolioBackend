package com.argentinaprograma.ap.services;

import com.argentinaprograma.ap.models.Experiencia;
import com.argentinaprograma.ap.repository.ExperienciaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienciaService {
@Autowired
    private ExperienciaRepo experienciaRepo;

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