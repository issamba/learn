package com.thunder.learn.bvo;

import com.thunder.learn.entity.BaseBVO;

import java.util.List;

public class PublicationBVO extends BaseBVO {

    private Integer idPublication;
    private String enonce;
    private boolean blocked;
    private boolean duplicated;
    private boolean resolved;
    private Integer idCreateur;
    private Integer idCategorie;
    private Integer idType;
    private List<CommentaireBVO> commentaires;
    private String libelleCategorie;
    private String libelleType;
    private String nomCreateur;

    public PublicationBVO() {

    }

    public PublicationBVO(Integer id) {
        this.idPublication = id;
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

    public Integer getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Integer idPublication) {
        this.idPublication = idPublication;
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

    public List<CommentaireBVO> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<CommentaireBVO> commentaires) {
        this.commentaires = commentaires;
    }


    public String getLibelleType() {
        return libelleType;
    }

    public void setLibelleType(String libelleType) {
        this.libelleType = libelleType;
    }

    public String getLibelleCategorie() {
        return libelleCategorie;
    }

    public void setLibelleCategorie(String libelleCategorie) {
        this.libelleCategorie = libelleCategorie;
    }

    public String getNomCreateur() {
        return nomCreateur;
    }

    public void setNomCreateur(String nomCreateur) {
        this.nomCreateur = nomCreateur;
    }
}
