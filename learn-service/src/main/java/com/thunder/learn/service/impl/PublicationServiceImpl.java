package com.thunder.learn.service.impl;

import com.thunder.learn.BaseService;
import com.thunder.learn.PublicationService;
import com.thunder.learn.bvo.PublicationBVO;
import com.thunder.learn.repository.PublicationRepository;
import com.thunder.learn.vo.PublicationVO;
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
    public PublicationBVO create(PublicationBVO publication) {
        return voToBvo(publicationRepository.saveAndFlush(bvoToVo(publication, PublicationVO.class)), PublicationBVO.class);
    }

}
