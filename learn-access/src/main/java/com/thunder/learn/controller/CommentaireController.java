package com.thunder.learn.controller;

import com.thunder.learn.bvo.CommentaireBVO;
import com.thunder.learn.bvo.ReactionBVO;
import com.thunder.learn.endpoint.rest.CommentaireEndpoint;
import com.thunder.learn.service.CommentaireService;
import com.thunder.learn.wvo.CommentaireWVO;
import com.thunder.learn.wvo.ReactionWVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commentaire")
@CrossOrigin(origins = "*" , allowedHeaders = "*")
public class CommentaireController extends BaseController implements CommentaireEndpoint {

    @Autowired
    private CommentaireService commentaireService;

    @Override
    public List<CommentaireWVO> getCommentaireByPublication(@RequestParam Integer idPublication) {
        return listBvoToWvo(commentaireService.getCommentaireBYPublication(idPublication), CommentaireWVO.class);
    }

    @Override
    public CommentaireWVO createCommentaire(CommentaireWVO commentaireWVO) {
        return bvoToWvo(commentaireService.createCommentaire(wvoToBvo(commentaireWVO, CommentaireBVO.class)), CommentaireWVO.class);
    }

    @Override
    public void deleteCommentaire(Integer idCommentaire) {
        commentaireService.deleteCommentaire(idCommentaire);
    }

    @Override
    public ReactionWVO react(ReactionWVO reaction) {
        return bvoToWvo(commentaireService.react(wvoToBvo(reaction, ReactionBVO.class)), ReactionWVO.class);
    }

    @Override
    public CommentaireWVO updateCommentaire(CommentaireWVO commentaireWVO) {
        return bvoToWvo(commentaireService.updateCommentaire(wvoToBvo(commentaireWVO, CommentaireBVO.class)), CommentaireWVO.class);
    }
}
