package com.argentinaprograma.ap.services;

import com.argentinaprograma.ap.models.Project;
import com.argentinaprograma.ap.repository.ProjectRepo;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProjectService {

    private final ProjectRepo projectRepo;

    public ProjectService(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

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