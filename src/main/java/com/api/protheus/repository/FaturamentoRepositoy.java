
package com.api.protheus.repository;


import com.api.protheus.models.Faturamento;
import java.util.Date;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FaturamentoRepositoy extends JpaRepository<Faturamento, Long>{
   
    @Query(value = "select u from Faturamento u where u.ultalt >= :ultalt and u.sitnfe <> 'DELETED'")
    Page<Faturamento> findQuery(@Param("ultalt") Date ultalt, Pageable pageable);
    
    @Query(value = "select u from Faturamento u where u.ultalt >= :ultalt and u.sitnfe = 'DELETED'")
    Page<Faturamento> findQueryDeleteds(@Param("ultalt") Date ultalt, Pageable pageable);
   
}

