
package com.portfolio_gs.backend.service;

import com.portfolio_gs.backend.model.CategoriaSkill;
import com.portfolio_gs.backend.model.Skill;
import com.portfolio_gs.backend.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    @Autowired
    public SkillRepository skillRepo;

    @Override
    public List<Skill> traerSkills() {
        return skillRepo.findAll();
    }

    @Override
    public Skill editarSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    @Override
    public void crearSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }
    
    @Override
    public List<Skill> buscarVariosPorCatSkill(CategoriaSkill catSkill){
    /*for(Long id : ids){
        borrarSkill(id);*/
        return skillRepo.findByCatSkill(catSkill);
    }
    
  
  
   
    
}
