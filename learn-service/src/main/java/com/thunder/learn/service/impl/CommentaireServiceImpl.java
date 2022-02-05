package com.thunder.learn.service.impl;

import com.thunder.learn.BaseService;
import com.thunder.learn.bvo.CommentaireBVO;
import com.thunder.learn.bvo.ReactionBVO;
import com.thunder.learn.repository.CommentaireRepositoryDAO;
import com.thunder.learn.repository.ReactionRepository;
import com.thunder.learn.service.CommentaireService;
import com.thunder.learn.vo.CommentaireVO;
import com.thunder.learn.vo.ReactionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentaireServiceImpl extends BaseService implements CommentaireService {

    @Autowired
    private CommentaireRepositoryDAO commentaireRepositoryDAO;

    @Autowired
    private ReactionRepository reactionRepository;

    @Override
    @Transactional
    public List<CommentaireBVO> getCommentaireBYPublication(Integer idPublication) {
        return listVoToBvo(commentaireRepositoryDAO.findAllByPublication_IdPublication(idPublication), CommentaireBVO.class);
    }

    @Override
    @Transactional
    @Modifying
    public void deleteCommentaire(Integer idCommentaire) {
        commentaireRepositoryDAO.deleteById(idCommentaire);
    }

    @Override
    @Transactional
    public CommentaireBVO createCommentaire(CommentaireBVO commentaire) {
        CommentaireVO created = commentaireRepositoryDAO.saveAndFlush(bvoToVo(commentaire, CommentaireVO.class));
        return voToBvo(created, CommentaireBVO.class);
    }

    @Override
    @Transactional
    public ReactionBVO react(ReactionBVO reaction) {
        return voToBvo(reactionRepository.saveAndFlush(bvoToVo(reaction, ReactionVO.class)), ReactionBVO.class);
    }
}
