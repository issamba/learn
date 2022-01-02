package com.thunder.learn.vo;

import com.thunder.learn.entity.BaseVO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publication")
public class PublicationVO extends BaseVO {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto généré
    @Column(name = "id")
    private Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    @Column(name = "enonce")
    private String enonce;
    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String text) {
        this.enonce = text;
    }
}
