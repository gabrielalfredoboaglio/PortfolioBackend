package com.argentinaprograma.ap.services;

import com.argentinaprograma.ap.models.Educacion;
import com.argentinaprograma.ap.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducacionService {
    @Autowired
    private EducacionRepo educacionRepo;

    public Educacion addEducacion(Educacion educacion){
        return  educacionRepo.save(educacion);
    }
    public List<Educacion> buscarEducaciones(){
        return educacionRepo.findAll();

    }
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public  void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }
}