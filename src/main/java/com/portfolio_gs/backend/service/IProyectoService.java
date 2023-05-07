
package com.portfolio_gs.backend.service;

import com.portfolio_gs.backend.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List<Proyecto> traerProyectos();
    public Proyecto editarProyecto(Proyecto proyecto);
    public void crearProyecto(Proyecto proyecto);
    public void borrarProyecto (Long id); 
}
