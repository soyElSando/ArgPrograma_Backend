package com.portfolio_gs.backend.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idEdu;
    
    @NotNull
    private String institucion;
    private String logoInstitucion;
    @NotNull
    private String tituloEs;
    @NotNull
    private String tituloEn;
    private String descripcionEs;
    private String descripcionEn;
    private String inicio;
    private String fin; 
    
    @ManyToOne
    @JoinColumn(name="idCatEdu")
    private CategoriaEducacion catEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String institucion, String logoInstitucion, String tituloEs, String tituloEn, String descripcionEs, String descripcionEn, String inicio, String fin, CategoriaEducacion catEdu) {
        this.idEdu = idEdu;
        this.institucion = institucion;
        this.logoInstitucion = logoInstitucion;
        this.tituloEs = tituloEs;
        this.tituloEn = tituloEn;
        this.descripcionEs = descripcionEs;
        this.descripcionEn = descripcionEn;
        this.inicio = inicio;
        this.fin = fin;
        this.catEdu = catEdu;
    }
    
    
    
}
