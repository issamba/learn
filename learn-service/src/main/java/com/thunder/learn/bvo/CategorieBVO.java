package com.thunder.learn.bvo;

import com.thunder.learn.entity.BaseBVO;

public class CategorieBVO extends BaseBVO {

    private Integer id;
    private String libelle;

    public CategorieBVO() {
    }

    public CategorieBVO(Integer id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
