/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.protheus.repository;

import com.api.protheus.models.PedidoOp;
import javax.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoOpRepository extends JpaRepository<PedidoOp, Long>{
    
        
    @Query(value = "select u from PedidoOp u where u.ZU_IDEPED = :idcab")
    PedidoOp findByIdSf(@Param("idcab") String idcab);
     
    @Query(value = "select u from PedidoOp u where u.ZU_IDEPED = :idcab")
    Page<PedidoOp> findByIdSf(@Param("idcab") String idcab, Pageable pageable);
    
    @Query(value = "select u from PedidoOp u where u.ZU_IDEPED = null")
    Page<PedidoOp> findNulls(Pageable pageable);
    
    String sql3 = "select COALESCE(max(R_E_C_N_O_),0)+1 from SZU010"; 
    @Query(value = sql3, nativeQuery = true)
    Long getNextId();
    
    String sql4 = "delete from PedidoOp i where i.ZU_IDEPED = (:idcab)";
    @Modifying
    @Transactional
    @Query(value = sql4)
    void deleteItensByIdSf(@Param("idcab") String idcab);
    
   


}