package com.argentinaprograma.ap.services;

import com.argentinaprograma.ap.models.Skill;
import com.argentinaprograma.ap.repository.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SkillService {
@Autowired
    private  SkillRepo skillRepo;



    public Skill addSkill(Skill skill){
        return skillRepo.save(skill);
    }
    public Skill updateSkill(Skill skill){
        return skillRepo.save(skill);
    }
    public List<Skill> findAllSkills(){
        return skillRepo.findAll();
    }
    public void deleteSkill(Long id){
        skillRepo.deleteById(id);
    }

}

