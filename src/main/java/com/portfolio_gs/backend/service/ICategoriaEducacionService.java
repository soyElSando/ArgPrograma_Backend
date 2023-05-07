
package com.portfolio_gs.backend.service;

import com.portfolio_gs.backend.model.CategoriaEducacion;
import java.util.List;


public interface ICategoriaEducacionService {
    public List<CategoriaEducacion> traerCategoriaEducacion();
    public CategoriaEducacion editarCategoriaEducacion(CategoriaEducacion cateEdu);
    public void crearCategoriaEducacion(CategoriaEducacion cateEdu);
    public void borrarCategoriaEducacion (Long id);
}
