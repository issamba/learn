package com.thunder.learn.vo;

import com.thunder.learn.entity.BaseVO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "categorie", schema = "plateforme_sesame")
public class CategorieVO extends BaseVO {

    private static final long serialVersionUID = -288487887996825751L;

    private Integer idCategorie;
    private String libelle;

    public CategorieVO(Integer idCategorie) {
        this.idCategorie = idCategorie;
    }

    public CategorieVO(Integer idCategorie, String libelle) {
        this.idCategorie = idCategorie;
        this.libelle = libelle;
    }

    public CategorieVO() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categorie")
    public Integer getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Integer idCategorie) {
        this.idCategorie = idCategorie;
    }

    @Basic
    @Column(name = "libelle")
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategorieVO that = (CategorieVO) o;
        return Objects.equals(idCategorie, that.idCategorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategorie, libelle);
    }

}
