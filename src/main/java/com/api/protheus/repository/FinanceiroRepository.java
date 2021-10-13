/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.protheus.repository;

import com.api.protheus.models.Financeiro;
import java.util.Date;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceiroRepository extends JpaRepository<Financeiro, Long>{
    
    @Query(value = "select u from Financeiro u where u.ultalt >= :ultalt and u.sittit <> 'DELETED'")
    Page<Financeiro> findQuery(@Param("ultalt") Date usu_ultalt, Pageable pageable);
    
    @Query(value = "select u from Financeiro u where u.datemi >= :datemi")
    Page<Financeiro> findQueryDatemi(@Param("datemi") Date datemi, Pageable pageable);
    
    @Query(value = "select u from Financeiro u where u.ultalt >= :ultalt and u.sittit = 'DELETED'")
    Page<Financeiro> findQueryDeleted(@Param("ultalt") Date usu_ultalt, Pageable pageable);
    
}
