package com.thunder.learn.bvo;

import com.thunder.learn.entity.BaseBVO;

public class PublicationBVO extends BaseBVO {

    private Integer id;
    private String enonce;
    private boolean blocked;
    private boolean duplicated;
    private boolean resolved;
    private Integer idCreateur;
    private Integer idCategorie;
    private Integer idType;


    public PublicationBVO() {
    }

    public PublicationBVO(Integer id) {
        this.id = id;
        this.blocked = false;
        this.resolved = false;
        this.duplicated = false;
    }

    public PublicationBVO(String enonce) {
        this.enonce = enonce;
        this.blocked = false;
        this.resolved = false;
        this.duplicated = false;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isDuplicated() {
        return duplicated;
    }

    public void setDuplicated(boolean duplicated) {
        this.duplicated = duplicated;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    public Integer getIdCreateur() {
        return idCreateur;
    }

    public void setIdCreateur(Integer idCreateur) {
        this.idCreateur = idCreateur;
    }


    public Integer getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Integer idCategorie) {
        this.idCategorie = idCategorie;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }
}
