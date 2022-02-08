package com.thunder.learn.repository;

import com.thunder.learn.vo.UtilisateurVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepositoryDAO extends JpaRepository<UtilisateurVO, Integer> {
    UtilisateurVO findByLoginAndAndMdp(String login, String password);
}
