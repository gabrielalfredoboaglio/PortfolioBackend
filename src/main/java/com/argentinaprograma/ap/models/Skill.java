package com.argentinaprograma.ap.models;



import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "skill")
@Data
public class Skill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_skill", nullable = false)
    private Long idSkill;
    @Column(name = "skill_name", nullable = false)
    private String skillName;
    @Column(name = "pic_skill")
    private String picSkill;
    @Column(name = "percent", nullable = false)
    private int percent;


}

