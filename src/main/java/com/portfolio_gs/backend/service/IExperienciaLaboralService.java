
package com.portfolio_gs.backend.service;

import com.portfolio_gs.backend.model.ExperienciaLaboral;
import java.util.List;

public interface IExperienciaLaboralService {
    public List<ExperienciaLaboral> traerExperiencias();
    public ExperienciaLaboral editarExperiencia(ExperienciaLaboral experiencia);
    public void crearExperiencia(ExperienciaLaboral experiencia);
    public void borrarExperiencia (Long id);
    
}
