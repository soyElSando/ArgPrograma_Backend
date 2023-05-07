
package com.portfolio_gs.backend.service;

import com.portfolio_gs.backend.model.Home;
import com.portfolio_gs.backend.repository.HomeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService implements IHomeService {
    @Autowired
    public HomeRepository homeRepo;

    @Override
    public List<Home> traerHomes() {
        return homeRepo.findAll();
    }

    @Override
    public Home editarHome(Home home) {
        return homeRepo.save(home);
    }

    @Override
    public void crearHome(Home home) {
        homeRepo.save(home);
    }

    @Override
    public void borrarHome(Long id) {
        homeRepo.deleteById(id);
    }
    
}
