
package com.portfolio_gs.backend.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class CategoriaSkill implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idCatSkill;
    
    @NotNull
    private String nombreCatSkillEs;
    @NotNull
    private String nombreCatSkillEn;
    
    /*@OneToMany(cascade = CascadeType.ALL, fetch= FetchType.EAGER, mappedBy = "catSkill")
    private Set<Skill> skills = new HashSet<>();*/

    public CategoriaSkill() {
    }

    public CategoriaSkill(Long idCatSkill, String nombreSkillEs,String nombreSkillEn ) {
        this.idCatSkill = idCatSkill;
        this.nombreCatSkillEs = nombreSkillEs;
        this.nombreCatSkillEn = nombreSkillEn;
    }
    
    
    
}
