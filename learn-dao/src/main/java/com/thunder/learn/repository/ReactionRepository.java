package com.thunder.learn.repository;

import com.thunder.learn.vo.ReactionVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionRepository extends JpaRepository<ReactionVO, Integer> {
}
