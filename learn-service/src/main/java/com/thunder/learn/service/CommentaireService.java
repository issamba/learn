package com.thunder.learn.service;

import com.thunder.learn.bvo.CommentaireBVO;
import com.thunder.learn.bvo.ReactionBVO;

import java.util.List;

public interface CommentaireService {

    List<CommentaireBVO> getCommentaireBYPublication(Integer idPublication);

    void deleteCommentaire(Integer idCommentaire);

    CommentaireBVO createCommentaire(CommentaireBVO wvoToBvo);

    ReactionBVO react(ReactionBVO wvoToBvo);
}
