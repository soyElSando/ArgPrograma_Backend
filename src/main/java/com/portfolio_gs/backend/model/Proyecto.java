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
public class Proyecto implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @NotNull
    private String nombreEs;
    @NotNull
    private String nombreEn;
    private String descripcionEs;
    private String descripcionEn;
    private String imagen;
    private String link;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombreEs,String nombreEn, String descripcionEs,String descripcionEn, String imagen, String link) {
        this.id = id;
        this.nombreEs = nombreEs;
        this.nombreEn = nombreEn;
        this.descripcionEs = descripcionEs;
        this.descripcionEn = descripcionEn;
        this.imagen = imagen;
        this.link = link;
    }
    
    
}
