package com.thunder.learn.endpoint.rest;

import com.thunder.learn.wvo.CommentaireWVO;
import com.thunder.learn.wvo.ReactionWVO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CommentaireEndpoint {
    @GetMapping("/")
    List<CommentaireWVO> getCommentaireByPublication(Integer idPublication);

    @PostMapping("/")
    CommentaireWVO createCommentaire(@RequestBody CommentaireWVO commentaireWVO);

    @DeleteMapping("/")
    void deleteCommentaire(Integer idCommentaire);

    @PostMapping("/react")
    ReactionWVO react(@RequestBody ReactionWVO reaction);

    @PutMapping("/")
    CommentaireWVO updateCommentaire(@RequestBody CommentaireWVO commentaireWVO);
}
