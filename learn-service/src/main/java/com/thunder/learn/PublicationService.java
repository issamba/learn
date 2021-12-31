package com.thunder.learn;

import com.thunder.learn.bvo.PublicationBVO;

import java.util.List;

public interface PublicationService {


    List<PublicationBVO> getPublications();

    PublicationBVO create(PublicationBVO publication);
}
