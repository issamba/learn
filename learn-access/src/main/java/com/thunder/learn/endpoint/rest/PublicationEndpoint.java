package com.thunder.learn.endpoint.rest;

import com.thunder.learn.wvo.PublicationWVO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PublicationEndpoint {


  List<PublicationWVO> getPublications();

  PublicationWVO create(@RequestBody PublicationWVO publication);
}
