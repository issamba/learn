package com.thunder.learn.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "membre")
public class MembreVO extends UtilisateurVO {

    private Integer badge;

    public MembreVO() {
    }

    @Column(name = "badge")
    public Integer getBadge() {
        return badge;
    }

    public void setBadge(Integer badge) {
        this.badge = badge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MembreVO membreVO = (MembreVO) o;
        return Objects.equals(badge, membreVO.badge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), badge);
    }
}
