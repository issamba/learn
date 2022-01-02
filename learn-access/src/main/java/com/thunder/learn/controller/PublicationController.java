package com.thunder.learn.controller;

import com.thunder.learn.PublicationService;
import com.thunder.learn.endpoint.rest.PublicationEndpoint;
import com.thunder.learn.wvo.PublicationWVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PublicationController extends BaseController implements PublicationEndpoint {

    @Autowired
    PublicationService publicationService;

    @Override
    public List<PublicationWVO> getPublications() {

        publicationService.getPublications();
        return null;
    }

    @Override
    public PublicationWVO getPublication(Integer id) {

        publicationService.getPublication(id);
        return null;
    }

    @Override
    public PublicationWVO ModifyPubliction(PublicationWVO publication) {
        return null;
    }

    @Override
    public PublicationWVO createPublication(PublicationWVO publication) {
        return null;
    }

    @Override
    public void deletePublication(Integer idPublication) {

    }
}
