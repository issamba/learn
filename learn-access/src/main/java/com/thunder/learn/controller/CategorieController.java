package com.thunder.learn.controller;

import com.thunder.learn.endpoint.rest.CategorieEndpoint;
import com.thunder.learn.service.CategorieService;
import com.thunder.learn.wvo.CategorieWVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorie")
public class CategorieController extends BaseController implements CategorieEndpoint {


    @Autowired
    private CategorieService categorieService;

    @Override
    public List<CategorieWVO> getCategories() {
        return listBvoToWvo(categorieService.getAll(), CategorieWVO.class);
    }
}
