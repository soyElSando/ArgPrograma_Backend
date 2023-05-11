
package com.portfolio_gs.backend.controller;

import com.portfolio_gs.backend.model.Home;
import com.portfolio_gs.backend.service.IHomeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Home")
@CrossOrigin(origins= "http://localhost:4200")
public class HomeController {
    @Autowired
    private IHomeService interHome;
    
    @GetMapping("/todos")
    @ResponseBody
    public List<Home> leerHomes(){
        return interHome.traerHomes();
    }
    
    @PostMapping("/agregar")
    public void agregarHome(@RequestBody Home home){
        interHome.crearHome(home);
    }
    
    @PutMapping("/editar")
    public void editarHome(@RequestBody Home home){
        interHome.editarHome(home);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarHome (@PathVariable Long id){
        interHome.borrarHome(id);
    }
}
