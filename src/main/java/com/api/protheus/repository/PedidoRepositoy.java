
package com.api.protheus.repository;


import com.api.protheus.models.Pedido;
import java.util.Date;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositoy extends JpaRepository<Pedido, Long>{
    
    @Query(value = "select u from Pedido u where u.ultalt >= :ultalt and u.sitped <> 'DELETED'")
    Page<Pedido> findQuery(@Param("ultalt") Date ultalt, Pageable pageable);
    
    @Query(value = "select u from Pedido u where u.ultalt >= :ultalt and u.sitped = 'DELETED'")
    Page<Pedido> findQueryDeleteds(@Param("ultalt") Date ultalt, Pageable pageable);
    
    
}

