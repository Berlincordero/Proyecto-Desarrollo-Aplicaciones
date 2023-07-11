
package com.proyecto.dao;



import com.proyecto.domain.Cliente.cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface clienteDao extends JpaRepository<cliente, Long> {
    //mas adelante vamos a crear metodos ampliados 
    
   
    
}
