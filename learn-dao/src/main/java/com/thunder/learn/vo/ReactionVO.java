package com.thunder.learn.vo;

import com.thunder.learn.entity.BaseVO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "reaction", schema = "plateforme_sesame")
public class ReactionVO extends BaseVO {

    private static final long serialVersionUID = -7990072164902460248L;

    private Integer idReaction;
    private Integer liked;
    private CommentaireVO commentaire;
    private Integer idUtilisateur;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reaction")
    public Integer getIdReaction() {
        return idReaction;
    }

    public void setIdReaction(Integer idReaction) {
        this.idReaction = idReaction;
    }

    @Basic
    @Column(name = "liked")
    public Integer getLiked() {
        return liked;
    }

    public void setLiked(Integer liked) {
        this.liked = liked;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReactionVO that = (ReactionVO) o;
        return Objects.equals(idReaction, that.idReaction) &&
                liked.equals(that.liked);
    }


    @Column(name = "id_membre", nullable = false)
    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReaction, liked);
    }

    @ManyToOne
    @JoinColumn(name = "id_commentaire", referencedColumnName = "id_commentaire", nullable = false)
    public CommentaireVO getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(CommentaireVO commentaire) {
        this.commentaire = commentaire;
    }
}
