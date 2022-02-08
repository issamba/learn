package com.thunder.learn.service;

import com.thunder.learn.bvo.PublicationBVO;

import java.util.List;

public interface PublicationService {


    List<PublicationBVO> getPublications();

    PublicationBVO getPublication(Integer id);

    PublicationBVO ModifyPubliction(PublicationBVO publication);

    PublicationBVO createPublication(PublicationBVO publication);

    void deletePublication(Integer idPublication);

    List<PublicationBVO> getMyPublications(Integer idUtilisateur);

    List<PublicationBVO> getTrendingPublications();
}
