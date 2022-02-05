package com.thunder.learn.wvo;

import com.thunder.learn.entity.BaseWVO;

import java.util.List;

public class CommentaireWVO extends BaseWVO {

    private Integer idCommentaire;
    private String enonce;
    private Integer checked;
    private Integer idCommentaireParent;
    private Integer idCreateur;
    private List<ReactionWVO> reactions;

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

    public List<ReactionWVO> getReactions() {
        return reactions;
    }

    public void setReactions(List<ReactionWVO> reactions) {
        this.reactions = reactions;
    }
}
