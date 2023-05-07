
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
public class CategoriaEducacion implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idCatEdu;
    @NotNull
    private String nombreCatEduEs;
    @NotNull
    private String nombreCatEduEn;

    public CategoriaEducacion() {
    }

    public CategoriaEducacion(Long idCatEdu, String nombreCatEduEs, String nombreCatEduEn) {
        this.idCatEdu = idCatEdu;
        this.nombreCatEduEs = nombreCatEduEs;
        this.nombreCatEduEn = nombreCatEduEn;
    }
    
    
}
