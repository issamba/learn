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
@Table(name = "type", schema = "plateforme_sesame")
public class TypeVO extends BaseVO {
    private static final long serialVersionUID = -288487887996825751L;

    private Integer idType;
    private String libelle;

    public TypeVO() {
    }

    public TypeVO(Integer idType, String libelle) {
        this.idType = idType;
        this.libelle = libelle;
    }

    public TypeVO(Integer idType) {
        this.idType = idType;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type")
    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
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
        TypeVO typeVO = (TypeVO) o;
        return Objects.equals(idType, typeVO.idType) &&
                Objects.equals(libelle, typeVO.libelle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idType, libelle);
    }
}
