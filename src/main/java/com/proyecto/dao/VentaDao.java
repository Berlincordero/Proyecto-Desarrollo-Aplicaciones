
package com.proyecto.dao;

import com.proyecto.domain.Construccion;
import com.proyecto.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface    VentaDao extends JpaRepository<Venta, Long> {
    //mas adelante vamos a crear metodos ampliados 
    
}
    