package com.argentinaprograma.ap.services;


import com.argentinaprograma.ap.models.Proyecto;
import com.argentinaprograma.ap.repository.ProyectoRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProyectoService {
    private final ProyectoRepo proyectoRepo;


    public ProyectoService(ProyectoRepo proyectoRepo) {
        this.proyectoRepo = proyectoRepo;
    }
    public Proyecto addProyecto(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }
    public List<Proyecto> buscarProyectos(){
        return proyectoRepo.findAll();
    }
    public Proyecto editarProyecto(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }
    public void borrarProyecto(Long id){
        proyectoRepo.deleteById(id);
    }
}
