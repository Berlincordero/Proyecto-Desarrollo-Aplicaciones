
package com.proyecto.dao;

import com.proyecto.domain.Cliente.cliente;
import com.proyecto.domain.Empleado;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpleadoDao extends JpaRepository<Empleado, Long> {
    //mas adelante vamos a crear metodos ampliados 
    
   
    
}