package com.argentinaprograma.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProy;
    private String tituloProy;
    private String desProy;

    public Proyecto() {
    }

    public Long getIdProy() {
        return idProy;
    }

    public void setIdProy(Long idProy) {
        this.idProy = idProy;
    }

    public String getTituloProy() {
        return tituloProy;
    }

    public void setTituloProy(String tituloProy) {
        this.tituloProy = tituloProy;
    }

    public String getDesProy() {
        return desProy;
    }

    public void setDesProy(String desProy) {
        this.desProy = desProy;
    }
}
