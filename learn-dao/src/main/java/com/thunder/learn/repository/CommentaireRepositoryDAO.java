package com.thunder.learn.repository;

import com.thunder.learn.vo.CommentaireVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentaireRepositoryDAO extends JpaRepository<CommentaireVO, Integer> {


    List<CommentaireVO> findAllByPublication_IdPublication(Integer idPublication);
}
