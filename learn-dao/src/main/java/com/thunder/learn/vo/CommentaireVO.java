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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "commentaire", schema = "plateforme_sesame")
public class CommentaireVO extends BaseVO  implements Serializable {

    private static final long serialVersionUID = -1869706376738323885L;

    private Integer idCommentaire;
    private String enonce;
    private Integer checked;
    private CommentaireVO commentaireParent;
    private MembreVO createur;
    private PublicationVO publication;
    private List<ReactionVO> reactions;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_commentaire")
    public Integer getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(Integer idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    @Basic
    @Column(name = "enonce")
    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    @Basic
    @Column(name = "checked")
    public Integer getChecked() {
        return checked;
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentaireVO that = (CommentaireVO) o;
        return idCommentaire == that.idCommentaire &&
                Objects.equals(enonce, that.enonce) &&
                Objects.equals(checked, that.checked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCommentaire, enonce, checked);
    }

    @ManyToOne
    @JoinColumn(name = "id_parent_cmnt", referencedColumnName = "id_commentaire")
    public CommentaireVO getCommentaireParent() {
        return commentaireParent;
    }

    public void setCommentaireParent(CommentaireVO commentaireByIdParentCmnt) {
        this.commentaireParent = commentaireByIdParentCmnt;
    }

    @ManyToOne
    @JoinColumn(name = "id_repondeur", referencedColumnName = "id_utilisateur", nullable = false)
    public MembreVO getCreateur() {
        return createur;
    }

    public void setCreateur(MembreVO createur) {
        this.createur = createur;
    }

    @ManyToOne
    @JoinColumn(name = "id_pub", referencedColumnName = "id_publication")
    public PublicationVO getPublication() {
        return publication;
    }

    public void setPublication(PublicationVO publication) {
        this.publication = publication;
    }

    @OneToMany(mappedBy = "commentaire")
    public List<ReactionVO> getReactions() {
        return reactions;
    }

    public void setReactions(List<ReactionVO> reactions) {
        this.reactions = reactions;
    }
}
