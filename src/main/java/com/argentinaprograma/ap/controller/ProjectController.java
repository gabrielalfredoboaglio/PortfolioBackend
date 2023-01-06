package com.argentinaprograma.ap.controller;

import com.argentinaprograma.ap.models.Project;
import com.argentinaprograma.ap.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/project")
@CrossOrigin(origins = "https://fronted-argentina-programa.web.app")
public class ProjectController {
    @Autowired
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public ResponseEntity<List<Project>> getAllProject(){
        List<Project> projects=projectService.findAllProjects();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Project> addProject(@RequestBody Project project){
        Project newProject=projectService.addProject(project);
        return new ResponseEntity<>(newProject,HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Project> updateProject(@RequestBody Project project){
        Project updateProject=projectService.updateProject(project);
        return new ResponseEntity<>(updateProject,HttpStatus.OK);
    }
    @DeleteMapping("/api/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable("id") Long id){
        projectService.deleteProject(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
