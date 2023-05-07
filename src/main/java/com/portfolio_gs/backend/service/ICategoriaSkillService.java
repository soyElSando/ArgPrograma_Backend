
package com.portfolio_gs.backend.service;

import com.portfolio_gs.backend.model.CategoriaSkill;
import java.util.List;


public interface ICategoriaSkillService {
    public List<CategoriaSkill> traerCategoriasSkills();
    public CategoriaSkill editarCategoriaSkill(CategoriaSkill cateSkill);
    public void crearCategoriaSkill(CategoriaSkill cateSkill);
    public void borrarCategoriaSkill (Long id);
    public CategoriaSkill buscarPorId(Long id);
}
