
package com.portfolio_gs.backend.repository;

import com.portfolio_gs.backend.model.CategoriaSkill;
import com.portfolio_gs.backend.model.Skill;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository <Skill, Long>{
    List<Skill> findByCatSkill (CategoriaSkill catSkill);
    
}
