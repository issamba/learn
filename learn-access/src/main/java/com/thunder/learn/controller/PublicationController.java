package com.thunder.learn.controller;

import com.thunder.learn.bvo.PublicationBVO;
import com.thunder.learn.endpoint.rest.PublicationEndpoint;
import com.thunder.learn.service.PublicationService;
import com.thunder.learn.wvo.PublicationWVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/publication")
@CrossOrigin(origins = "*" , allowedHeaders = "*")
public class PublicationController extends BaseController implements PublicationEndpoint {

    @Autowired
    PublicationService publicationService;

    @Override
    public List<PublicationWVO> getPublications() {

        return listBvoToWvo(publicationService.getPublications(), PublicationWVO.class);
    }

    @Override
    public List<PublicationWVO> getMyPublications(@RequestParam Integer idUtilisateur) {
        return listBvoToWvo(publicationService.getMyPublications(idUtilisateur), PublicationWVO.class);
    }
    @Override
    public List<PublicationWVO> getTrendingPublications() {
        return listBvoToWvo(publicationService.getTrendingPublications(), PublicationWVO.class);
    }

    @Override
    public PublicationWVO getPublication(@RequestParam Integer id) {
        return bvoToWvo(publicationService.getPublication(id), PublicationWVO.class);
    }

    @Override
    public PublicationWVO ModifyPubliction(@RequestBody PublicationWVO publication) {
        return null;
    }

    @Override
    public PublicationWVO createPublication(@RequestBody PublicationWVO publication) {
        PublicationBVO publicationToCreate = wvoToBvo(publication, PublicationBVO.class);
        return bvoToWvo(publicationService.createPublication(publicationToCreate), PublicationWVO.class);
    }

    @Override
    public void deletePublication(@RequestParam Integer idPublication) {
        publicationService.deletePublication(idPublication);
    }


}
