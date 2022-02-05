package com.thunder.learn.wvo;

import com.thunder.learn.entity.BaseWVO;

public class ReactionWVO extends BaseWVO {

    private Integer idReaction;
    private Integer liked;
    private Integer idCommentaire;
    private Integer idUtilisateur;

    public Integer getIdReaction() {
        return idReaction;
    }

    public void setIdReaction(Integer idReaction) {
        this.idReaction = idReaction;
    }

    public Integer getLiked() {
        return liked;
    }

    public void setLiked(Integer liked) {
        this.liked = liked;
    }

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Integer getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(Integer idCommentaire) {
        this.idCommentaire = idCommentaire;
    }
}
