package com.thunder.learn.repository;

import com.thunder.learn.vo.PublicationVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicationRepository extends JpaRepository<PublicationVO, Integer> {

    List<PublicationVO> findAllByCreateur_idUtilisateur(Integer idUtilisateur);

    @Query("select distinct c.publication.idPublication from  CommentaireVO  c order by c.date desc ")
    List<Integer> findTrendingPublication();
}
