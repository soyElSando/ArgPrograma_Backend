package com.portfolio_gs.backend.repository;

import com.portfolio_gs.backend.model.CategoriaSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaSkillRepository extends JpaRepository <CategoriaSkill, Long>{
    
}
