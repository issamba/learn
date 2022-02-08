package com.thunder.learn.bvo;

import com.thunder.learn.entity.BaseBVO;

import java.util.Date;
import java.util.List;

public class CommentaireBVO extends BaseBVO {

    private Integer idCommentaire;
    private String enonce;
    private Integer checked;
    private Integer idCommentaireParent;
    private Integer idCreateur;
    private Integer idPublication;
    private List<ReactionBVO> reactions;
    private Date date;
    private String nomCreateur;

    public Integer getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(Integer idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    public Integer getChecked() {
        return checked;
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    public Integer getIdCommentaireParent() {
        return idCommentaireParent;
    }

    public void setIdCommentaireParent(Integer idCommentaireParent) {
        this.idCommentaireParent = idCommentaireParent;
    }

    public Integer getIdCreateur() {
        return idCreateur;
    }

    public void setIdCreateur(Integer idCreateur) {
        this.idCreateur = idCreateur;
    }

    public List<ReactionBVO> getReactions() {
        return reactions;
    }

    public void setReactions(List<ReactionBVO> reactions) {
        this.reactions = reactions;
    }

    public Integer getIdPublication() {
        return idPublication;
    }


    public void setIdPublication(Integer idPublication) {
        this.idPublication = idPublication;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNomCreateur() {
        return nomCreateur;
    }

    public void setNomCreateur(String nomCreateur) {
        this.nomCreateur = nomCreateur;
    }
}
