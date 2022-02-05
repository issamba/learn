package com.thunder.learn.service.impl;

import com.thunder.learn.BaseService;
import com.thunder.learn.bvo.CategorieBVO;
import com.thunder.learn.repository.CategorieRepositoryDAO;
import com.thunder.learn.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl extends BaseService implements CategorieService {

    @Autowired
    private CategorieRepositoryDAO categorieRepositoryDAO;

    @Override
    public List<CategorieBVO> getAll() {
        return listVoToBvo(categorieRepositoryDAO.findAll(), CategorieBVO.class);
    }
}
