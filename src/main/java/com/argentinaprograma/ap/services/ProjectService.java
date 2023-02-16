package com.argentinaprograma.ap.services;

import com.argentinaprograma.ap.models.Project;
import com.argentinaprograma.ap.repository.ProjectRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProjectService {
@Autowired
    private  ProjectRepo projectRepo;


    public Project addProject(Project project){
        return projectRepo.save(project);
    }
    public Project updateProject(Project project){
        return projectRepo.save(project);
    }
    public List<Project> findAllProjects(){
        return projectRepo.findAll();
    }
    public void deleteProject(Long id){
        projectRepo.deleteById(id);
    }
}