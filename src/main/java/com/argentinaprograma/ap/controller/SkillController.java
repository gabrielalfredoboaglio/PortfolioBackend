package com.argentinaprograma.ap.controller;

import com.argentinaprograma.ap.models.Skill;
import com.argentinaprograma.ap.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skill")

public class SkillController {
    @Autowired
    private  SkillService skillService;



    @GetMapping("/all")
    public ResponseEntity<List<Skill>> getAllSkill(){
        List<Skill> projects=skillService.findAllSkills();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Skill> addSkill(@RequestBody Skill skill){
        Skill newSkill=skillService.addSkill(skill);
        return new ResponseEntity<>(newSkill,HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Skill> updateSkill(@RequestBody Skill project){
        Skill updateSkill=skillService.updateSkill(project);
        return new ResponseEntity<>(updateSkill,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable("id") Long id){
        skillService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
