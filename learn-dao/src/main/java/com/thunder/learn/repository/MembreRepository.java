package com.thunder.learn.repository;

import com.thunder.learn.vo.MembreVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembreRepository extends JpaRepository<MembreVO, Integer> {
}
