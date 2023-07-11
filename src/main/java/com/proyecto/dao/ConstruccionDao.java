
package com.proyecto.dao;


import com.proyecto.domain.Construccion;
import com.proyecto.domain.Empleado;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConstruccionDao extends JpaRepository<Construccion, Long> {
    //mas adelante vamos a crear metodos ampliados 
    
}
    