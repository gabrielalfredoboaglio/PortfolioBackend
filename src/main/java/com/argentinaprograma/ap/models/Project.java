package com.argentinaprograma.ap.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "projects")
@Data
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_project")
    private Long idPro;

    @Column(length = 255, nullable = false, name = "title_project")
    private String titlePro;

    @Column(length = 500, nullable = false, name = "desc_project")
    private String descPro;

    @Column(length = 255, nullable = false, name = "link_project")
    private String linkPro;

    @Column(length = 255, nullable = false, name = "pic_project")
    private String picPro;

}
