package com.argentinaprograma.ap.repository;

import com.argentinaprograma.ap.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepo extends JpaRepository<Skill,Long> {
}