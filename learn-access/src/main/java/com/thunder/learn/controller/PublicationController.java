package com.thunder.learn.controller;

import com.thunder.learn.PublicationService;
import com.thunder.learn.bvo.PublicationBVO;
import com.thunder.learn.endpoint.rest.PublicationEndpoint;
import com.thunder.learn.wvo.PublicationWVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "publication")
public class PublicationController extends BaseController implements PublicationEndpoint {

    @Autowired
    private PublicationService publicationService;

    @Override
    @GetMapping("/")
    public List<PublicationWVO> getPublications() {
        return listBvoToWvo(publicationService.getPublications(), PublicationWVO.class);
    }


    @Override
    @PostMapping("/")
    public PublicationWVO create(@RequestBody PublicationWVO publication) {
        PublicationBVO bvo = wvoToBvo(publication, PublicationBVO.class);
        return bvoToWvo(publicationService.create(bvo), PublicationWVO.class);
    }
}
