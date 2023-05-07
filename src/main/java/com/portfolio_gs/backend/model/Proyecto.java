package com.portfolio_gs.backend.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import jakarta.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idProy;
    
    @NotNull
    private String nombreProyEs;
    @NotNull
    private String nombreProyEn;
    private String descripcionProyEs;
    private String descripcionProyEn;
    private String imagenProy;
    private String linkProy;

    public Proyecto() {
    }

    public Proyecto(Long idProy, String nombreProyEs,String nombreProyEn, String descripcionProyEs,String descripcionProyEn, String imagenProy, String linkProy) {
        this.idProy = idProy;
        this.nombreProyEs = nombreProyEs;
        this.nombreProyEn = nombreProyEn;
        this.descripcionProyEs = descripcionProyEs;
        this.descripcionProyEn = descripcionProyEn;
        this.imagenProy = imagenProy;
        this.linkProy = linkProy;
    }
    
    
}
