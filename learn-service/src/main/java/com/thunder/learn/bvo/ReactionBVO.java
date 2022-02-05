package com.thunder.learn.bvo;

import com.thunder.learn.entity.BaseBVO;

public class ReactionBVO extends BaseBVO {
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

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public void setLiked(Integer liked) {
        this.liked = liked;
    }

    public Integer getIdCommentaire() {
        return idCommentaire;
    }


    public void setIdCommentaire(Integer idCommentaire) {
        this.idCommentaire = idCommentaire;
    }
}
