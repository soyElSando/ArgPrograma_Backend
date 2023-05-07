
package com.portfolio_gs.backend.repository;

import com.portfolio_gs.backend.model.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository <Home, Long>{
    
}
