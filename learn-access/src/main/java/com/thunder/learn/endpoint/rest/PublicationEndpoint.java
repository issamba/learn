package com.thunder.learn.endpoint.rest;

import com.thunder.learn.wvo.PublicationWVO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface PublicationEndpoint {

    @GetMapping("/getAll")
    List<PublicationWVO> getPublications();

    @GetMapping("/")
    PublicationWVO getPublication(@RequestParam Integer id);

    @PutMapping("/")
    PublicationWVO ModifyPubliction(@RequestBody PublicationWVO publication);

    @PostMapping("/")
    PublicationWVO createPublication(@RequestBody PublicationWVO publication);

    @DeleteMapping("/")
    void deletePublication(@RequestParam Integer idPublication);

}
