
package com.portfolio_gs.backend.service;

import com.portfolio_gs.backend.model.ExperienciaLaboral;
import com.portfolio_gs.backend.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService{
 @Autowired
    public ExperienciaLaboralRepository experienciaRepo;   

    @Override
    public List<ExperienciaLaboral> traerExperiencias() {
        return experienciaRepo.findAll();
    }

    @Override
    public ExperienciaLaboral editarExperiencia(ExperienciaLaboral experiencia) {
        return experienciaRepo.save(experiencia);
    }

    @Override
    public void crearExperiencia(ExperienciaLaboral experiencia) {
        experienciaRepo.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }
}
