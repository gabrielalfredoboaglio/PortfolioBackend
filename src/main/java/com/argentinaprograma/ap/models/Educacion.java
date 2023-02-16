package com.argentinaprograma.ap.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
public class Educacion {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long idEdu;
        private String tituloEdu;
        private int fechaEdu;
        private String descEdu;
        private String imagenEdu;


}
