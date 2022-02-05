package com.thunder.lean.service;


import com.thunder.learn.bvo.PublicationBVO;
import com.thunder.learn.repository.PublicationRepository;
import com.thunder.learn.service.impl.PublicationServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;


public class PublicationServiceTest {

    @Mock
    private PublicationRepository publicationRepository;


    @InjectMocks
    private PublicationServiceImpl publicationService;


    @DisplayName("Test Spring @Autowired Integration")
//    @Test
    public void shouldNotPersistEmptyEnoncePublication() {
        PublicationBVO publicationToBeSaved = new PublicationBVO("");

        Exception expected = Assertions.assertThrows(IllegalArgumentException.class, () ->
                publicationService.createPublication(publicationToBeSaved), "the service shouldn't accept a publication without ennonce"
        );


    }


}
