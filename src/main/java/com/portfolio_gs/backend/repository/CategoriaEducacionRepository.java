
package com.portfolio_gs.backend.repository;

import com.portfolio_gs.backend.model.CategoriaEducacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaEducacionRepository extends JpaRepository <CategoriaEducacion, Long> {
    
}
