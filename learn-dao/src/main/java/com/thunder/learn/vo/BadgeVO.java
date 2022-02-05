package com.thunder.learn.vo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "badge", schema = "plateforme_sesame")

public class BadgeVO {
    private Integer idBadge;
    private String libelle;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_badge")
    public Integer getIdBadge() {
        return idBadge;
    }

    public void setIdBadge(Integer idBadge) {
        this.idBadge = idBadge;
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
        BadgeVO badgeVO = (BadgeVO) o;
        return idBadge == badgeVO.idBadge &&
                libelle.equals(badgeVO.libelle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBadge, libelle);
    }
}
