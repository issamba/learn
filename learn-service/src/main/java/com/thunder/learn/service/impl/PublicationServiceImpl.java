package com.thunder.learn.service.impl;

import com.google.common.base.Preconditions;
import com.thunder.learn.BaseService;
import com.thunder.learn.PublicationService;
import com.thunder.learn.bvo.PublicationBVO;
import com.thunder.learn.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationServiceImpl extends BaseService implements PublicationService {

    @Autowired
    private PublicationRepository publicationRepository;


    @Override
    public List<PublicationBVO> getPublications() {
        return listVoToBvo(publicationRepository.findAll(), PublicationBVO.class);
    }

    @Override
    public PublicationBVO getPublication(Integer id) {
        return null;
    }

    @Override
    public PublicationBVO ModifyPubliction(PublicationBVO publication) {
        return null;
    }

    @Override
    public PublicationBVO createPublication(PublicationBVO publication) {
        Preconditions.checkNotNull(publication.getEnonce());
        Preconditions.checkArgument(publication.getEnonce().length() > 0);
        return null;
    }

    @Override
    public void deletePublication(Integer idPublication) {

    }


}
