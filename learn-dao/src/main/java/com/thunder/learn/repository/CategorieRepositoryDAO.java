package com.thunder.learn.repository;

import com.thunder.learn.vo.CategorieVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepositoryDAO extends JpaRepository<CategorieVO, Integer> {
}
