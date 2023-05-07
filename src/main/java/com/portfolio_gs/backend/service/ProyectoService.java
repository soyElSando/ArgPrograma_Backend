
package com.portfolio_gs.backend.service;

import com.portfolio_gs.backend.model.Proyecto;
import com.portfolio_gs.backend.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    public ProyectoRepository proyectoRepo;

    @Override
    public List<Proyecto> traerProyectos() {
        return proyectoRepo.findAll();
    }

    @Override
    public Proyecto editarProyecto(Proyecto proyecto) {
       return proyectoRepo.save(proyecto);
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        proyectoRepo.save(proyecto);
        
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }
}
