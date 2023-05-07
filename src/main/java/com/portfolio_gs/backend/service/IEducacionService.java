
package com.portfolio_gs.backend.service;

import com.portfolio_gs.backend.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion> traerEducaciones();
    public Educacion editarEducacion(Educacion educacion);
    public void crearEducacion(Educacion educacion);
    public void borrarEducacion (Long id);
    
}
