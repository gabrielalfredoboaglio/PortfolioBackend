package com.argentinaprograma.ap.repository;

import com.argentinaprograma.ap.models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ExperienciaRepo extends JpaRepository<Experiencia,Long> {
}