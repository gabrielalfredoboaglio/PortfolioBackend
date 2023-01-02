package com.argentinaprograma.ap.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "projects")
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,name = "id_project")
    private Long idPro;

    @Column(length = 255,nullable = false,name = "title_project")
    private String titlePro;

    @Column(length = 500,nullable = false,name = "desc_project")
    private String descPro;

    @Column(length = 255,nullable = false,name = "link_project")
    private String linkPro;

    @Column(length = 255,nullable = false,name = "pic_project")
    private String picPro;

    public Project() {
    }

    public Project(Long idPro, String titlePro, String descPro, String linkPro,String picPro) {
        this.idPro = idPro;
        this.titlePro = titlePro;
        this.descPro = descPro;
        this.linkPro = linkPro;
        this.picPro=picPro;
    }

    public Long getIdPro() {
        return idPro;
    }

    public void setIdPro(Long idPro) {
        this.idPro = idPro;
    }

    public String getTitlePro() {
        return titlePro;
    }

    public void setTitlePro(String titlePro) {
        this.titlePro = titlePro;
    }

    public String getDescPro() {
        return descPro;
    }

    public void setDescPro(String descPro) {
        this.descPro = descPro;
    }

    public String getLinkPro() {
        return linkPro;
    }

    public void setLinkPro(String linkPro) {
        this.linkPro = linkPro;
    }

    public String getPicPro() {
        return picPro;
    }

    public void setPicPro(String picPro) {
        this.picPro = picPro;
    }
}
