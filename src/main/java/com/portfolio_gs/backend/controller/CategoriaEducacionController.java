
package com.portfolio_gs.backend.controller;

import com.portfolio_gs.backend.model.CategoriaEducacion;
import com.portfolio_gs.backend.service.ICategoriaEducacionService;
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
@RequestMapping("/CategoriasEducacion")
//@CrossOrigin(origins= "http://localhost:4200")
@CrossOrigin(origins= "https://portfolio-gs-5962c.web.app")

public class CategoriaEducacionController {
    @Autowired
    private ICategoriaEducacionService interCatEdu;
    
    @GetMapping("/todos")
    @ResponseBody
    public List<CategoriaEducacion> leerCategoriasEducaciones(){
        return interCatEdu.traerCategoriaEducacion();
    }
    
    //Los siguientes endpoints no estàn implementados en el front.
    @PostMapping("/agregar")
    public void agregarCategoriaEducacion(@RequestBody CategoriaEducacion catEdu){
        interCatEdu.crearCategoriaEducacion(catEdu);
    }
    
    @PutMapping("/editar")
    public void editarCategoriaEducacion(@RequestBody CategoriaEducacion catEdu){
        interCatEdu.editarCategoriaEducacion(catEdu);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarCategoriaEducacion (@PathVariable Long id){
        interCatEdu.borrarCategoriaEducacion(id);
    }

}
