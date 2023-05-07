
package com.portfolio_gs.backend.service;

import com.portfolio_gs.backend.model.Home;
import java.util.List;

public interface IHomeService {
    public List<Home> traerHomes();
    public Home editarHome(Home home);
    public void crearHome(Home home);
    public void borrarHome (Long id); 
}
