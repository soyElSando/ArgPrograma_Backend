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
public class ExperienciaLaboral implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idExp;    
       
    private String puestoEs;
    private String puestoEn;
    @NotNull
    private String empresa;
    private String logoEmpresa;
    private String inicio;
    private String fin;
    

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Long idExp, String puestoEs, String puestoEn, String empresa, String logoEmpresa, String inicio, String fin) {
        this.idExp = idExp;
        this.puestoEs = puestoEs;
        this.puestoEn = puestoEn;
        this.empresa = empresa;
        this.logoEmpresa = logoEmpresa;
        this.inicio = inicio;
        this.fin = fin;
    }

    
    
    
}
