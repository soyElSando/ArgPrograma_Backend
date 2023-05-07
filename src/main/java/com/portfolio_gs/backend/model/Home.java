
package com.portfolio_gs.backend.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Home implements Serializable {
 @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idHome;
    
    @NotNull
    private String nombreHomeEs;
    @NotNull
    private String nombreHomeEn;
    private String descripcionHomeEs;
    private String descripcionHomeEn;
    private String imagenHome;
    private String linkHome;

    public Home() {
    }

    public Home(Long idHome, String nombreHomeEs,String nombreHomeEn, String descripcionHomeEs,String descripcionHomeEn, String imagenHome, String linkHome) {
        this.idHome = idHome;
        this.nombreHomeEs = nombreHomeEs;
        this.nombreHomeEn = nombreHomeEn;
        this.descripcionHomeEs = descripcionHomeEs;
        this.descripcionHomeEn = descripcionHomeEn;
        this.imagenHome = imagenHome;
        this.linkHome = linkHome;
    }
       
}
