package com.thunder.learn.endpoint.rest;

import com.thunder.learn.wvo.CategorieWVO;

import java.util.List;

public interface CategorieEndpoint {
    List<CategorieWVO> getCategories();
}
