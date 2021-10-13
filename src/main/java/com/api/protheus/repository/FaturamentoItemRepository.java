
package com.api.protheus.repository;

import com.api.protheus.models.FaturamentoItem;
import java.util.Date;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FaturamentoItemRepository extends JpaRepository<FaturamentoItem, Long>{
  
    @Query(value = "select u from FaturamentoItem u  where u.ultalt BETWEEN :ultalt and :enddate")
    Page<FaturamentoItem> findQuery(@Param("ultalt") Date ultalt, @Param("enddate") Date enddate, Pageable pageable);
    
}
