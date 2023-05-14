
package com.portfolio_gs.backend.controller;

import com.portfolio_gs.backend.model.CategoriaSkill;
import com.portfolio_gs.backend.model.Skill;
import com.portfolio_gs.backend.service.ICategoriaSkillService;
import com.portfolio_gs.backend.service.ISkillService;
import java.util.ArrayList;
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
@RequestMapping("/CategoriasSkill")
//@CrossOrigin(origins= "http://localhost:4200")
@CrossOrigin(origins= "https://portfolio-gs-5962c.web.app")
public class CategoriaSkillController {
    @Autowired
    private ICategoriaSkillService interCatSkill;
    @Autowired
    private ISkillService interSkill;
    
    @GetMapping("/todos")
    @ResponseBody
    public List<CategoriaSkill> leerCategoriasSkills(){
        return interCatSkill.traerCategoriasSkills();
    }
    
    @PostMapping("/agregar")
    public void agregarCategoriaSkill(@RequestBody CategoriaSkill catKill){
        interCatSkill.crearCategoriaSkill(catKill);
    }
    
    @PutMapping("/editar")
    public void editarCategoriaSkill(@RequestBody CategoriaSkill catKill){
        interCatSkill.editarCategoriaSkill(catKill);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarCategoriaSkill (@PathVariable Long id){
        CategoriaSkill catSkillABorrar = interCatSkill.buscarPorId(id);
        List<Skill> listaABorrar;
        listaABorrar = interSkill.buscarVariosPorCatSkill(catSkillABorrar);
        List<Long> listaDeIdsABorrar = new ArrayList<Long> ();
        for (Skill skill : listaABorrar ){
            listaDeIdsABorrar.add(skill.getIdSkill());
        }
        for(Long idSkill : listaDeIdsABorrar){
        interSkill.borrarSkill(idSkill);
        }       
        
        interCatSkill.borrarCategoriaSkill(id); 
    }

}
