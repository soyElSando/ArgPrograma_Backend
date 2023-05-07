package com.portfolio_gs.backend.service;

import com.portfolio_gs.backend.model.CategoriaSkill;
import com.portfolio_gs.backend.model.Skill;
import java.util.List;

public interface ISkillService {
    public List<Skill> traerSkills();
    public Skill editarSkill(Skill skill);
    public void crearSkill(Skill skill);
    public void borrarSkill (Long id);
    public List<Skill> buscarVariosPorCatSkill(CategoriaSkill catSkill);
    
}
