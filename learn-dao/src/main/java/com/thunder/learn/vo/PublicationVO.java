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
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "publication")
public class PublicationVO extends BaseVO  {

    private static final long serialVersionUID = 908507513124510718L;
    private String enonce;
    private Integer idPublication;
    private Date dateCreation;
    private Integer resolue;
    private Integer duplicated;
    private Integer bloqued;

    private List<CommentaireVO> commentaires;
    private MembreVO createur;
    private CategorieVO categorie;
    private TypeVO type;


    @Column(name = "enonce")
    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String text) {
        this.enonce = text;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_publication")
    public Integer getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Integer idPublication) {
        this.idPublication = idPublication;
    }


    @Column(name = "date_creation")
    public Date getDateCreation() {
        return dateCreation;
    }


    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }


    @Column(name = "resolue")
    public Integer getResolue() {
        return resolue;
    }

    public void setResolue(Integer resolue) {
        this.resolue = resolue;
    }


    @Column(name = "duplicated")
    public Integer getDuplicated() {
        return duplicated;
    }

    public void setDuplicated(Integer duplicated) {
        this.duplicated = duplicated;
    }


    @Column(name = "bloquee")
    public Integer getBloqued() {
        return bloqued;
    }

    public void setBloqued(Integer bloqued) {
        this.bloqued = bloqued;
    }


    @OneToMany(mappedBy = "publication")
    public List<CommentaireVO> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<CommentaireVO> commentaires) {
        this.commentaires = commentaires;
    }


    @ManyToOne
    @JoinColumn(name = "id_createur", referencedColumnName = "id_utilisateur", nullable = false)
    public MembreVO getCreateur() {
        return createur;
    }

    public void setCreateur(MembreVO createur) {
        this.createur = createur;
    }

    @ManyToOne
    @JoinColumn(name = "id_categorie", referencedColumnName = "id_categorie", nullable = false)
    public CategorieVO getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieVO categorie) {
        this.categorie = categorie;
    }

    @ManyToOne
    @JoinColumn(name = "id_type", referencedColumnName = "id_type", nullable = false)
    public TypeVO getType() {
        return type;
    }

    public void setType(TypeVO type) {
        this.type = type;
    }

}
