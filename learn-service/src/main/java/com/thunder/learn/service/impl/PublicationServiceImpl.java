package com.thunder.learn.service.impl;

import com.google.common.base.Preconditions;
import com.thunder.learn.BaseService;
import com.thunder.learn.bvo.CommentaireBVO;
import com.thunder.learn.bvo.PublicationBVO;
import com.thunder.learn.repository.PublicationRepository;
import com.thunder.learn.service.PublicationService;
import com.thunder.learn.vo.PublicationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
        Comparator<CommentaireBVO> comparator = (a, b) -> a.getDate().after(b.getDate()) ? 1 : -1;
        PublicationBVO publication = voToBvo(publicationRepository.getById(id), PublicationBVO.class);
        List<CommentaireBVO> sorted = publication.getCommentaires().stream().sorted(comparator).collect(Collectors.toList());
        publication.setCommentaires(sorted);
        return publication;
    }

    @Override
    @Transactional
    public PublicationBVO ModifyPubliction(@RequestBody PublicationBVO publication) {
        Preconditions.checkNotNull(publication.getEnonce());
        Preconditions.checkArgument(publication.getEnonce().length() > 0);
        PublicationVO entityToBePersisted = bvoToVo(publication, PublicationVO.class);
        return voToBvo(publicationRepository.saveAndFlush(entityToBePersisted), PublicationBVO.class);
    }

    @Override
    @Transactional
    public PublicationBVO createPublication(@RequestBody PublicationBVO publication) {
        Preconditions.checkNotNull(publication.getEnonce());
        Preconditions.checkArgument(publication.getEnonce().length() > 0);
        PublicationVO entityToBePersisted = bvoToVo(publication, PublicationVO.class);
        entityToBePersisted.setDateCreation(new Date());
        return voToBvo(publicationRepository.saveAndFlush(entityToBePersisted), PublicationBVO.class);
    }


    @Override
    @Transactional
    @Modifying
    public void deletePublication(Integer idPublication) {
        publicationRepository.deleteById(idPublication);
    }

    @Override
    @Transactional
    public List<PublicationBVO> getMyPublications(Integer idUtilisateur) {
        List<PublicationVO> myPublications = publicationRepository.findAllByCreateur_idUtilisateur(idUtilisateur);
        myPublications.forEach(el -> el.setCommentaires(null));
        return listVoToBvo(myPublications, PublicationBVO.class);
    }

    @Override
    @Transactional
    public List<PublicationBVO> getTrendingPublications() {
        List<Integer> pubs = publicationRepository.findTrendingPublication().stream().limit(10).collect(Collectors.toList());
        return pubs.stream().map(this::getPublication).collect(Collectors.toList());
    }


}
