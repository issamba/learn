package com.thunder.learn.service.impl;

import com.thunder.learn.BaseService;
import com.thunder.learn.bvo.UtilisateurBVO;
import com.thunder.learn.repository.UtilisateurRepositoryDAO;
import com.thunder.learn.service.UtilisateurService;
import com.thunder.learn.vo.UtilisateurVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class UtilisateurServiceImpl extends BaseService implements UtilisateurService {
    @Autowired
    private UtilisateurRepositoryDAO utilisateurRepositoryDAO;

    @Override
    @Transactional
    public UtilisateurBVO authentificate(String login, String password) {
        UtilisateurVO vo = this.utilisateurRepositoryDAO.findByLoginAndAndMdp(login, password);
        if (vo != null) {
            return voToBvo(vo, UtilisateurBVO.class);
        }
        return null;
    }
}
