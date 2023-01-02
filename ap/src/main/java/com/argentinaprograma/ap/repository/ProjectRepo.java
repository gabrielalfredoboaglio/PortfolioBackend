package com.argentinaprograma.ap.repository;

import com.argentinaprograma.ap.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project,Long> {
}
