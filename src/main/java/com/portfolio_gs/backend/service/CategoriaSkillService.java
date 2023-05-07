
package com.portfolio_gs.backend.service;

import com.portfolio_gs.backend.model.CategoriaSkill;
import com.portfolio_gs.backend.repository.CategoriaSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaSkillService implements ICategoriaSkillService {
  @Autowired
    public CategoriaSkillRepository catSkillRepo;  

    @Override
    public List<CategoriaSkill> traerCategoriasSkills() {
        return catSkillRepo.findAll();
    }

    @Override
    public CategoriaSkill editarCategoriaSkill(CategoriaSkill cateSkill) {
        return catSkillRepo.save(cateSkill);
    }

    @Override
    public void crearCategoriaSkill(CategoriaSkill cateSkill) {
        catSkillRepo.save(cateSkill);
    }

    @Override
    public void borrarCategoriaSkill(Long id) {
        catSkillRepo.deleteById(id);
    }
    
    @Override
    public CategoriaSkill buscarPorId(Long id){
        return catSkillRepo.findById(id).orElse(null);
    }
}
