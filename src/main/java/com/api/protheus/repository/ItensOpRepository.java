
package com.api.protheus.repository;

import com.api.protheus.models.ItensOp;
import javax.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ItensOpRepository extends JpaRepository<ItensOp, Long>{
    
   
    @Query(value = "select COALESCE(max(R_E_C_N_O_),0)+1 from SZX010", 
            nativeQuery = true)
    Long getNextId();
    
    
    @Query(value = "select u from ItensOp u where u.ZX_IDEPED = :idcab")
    Page<ItensOp> findByIdSf(@Param("idcab") String idcab, Pageable pageable);
    
    @Modifying
    @Transactional
    @Query(value = "delete from ItensOp i where i.ZX_IDEPED = :idcab")
    void deleteItensByIdSf(@Param("idcab") String idcab);
    
    @Query("SELECT COUNT(ra)+1 FROM ItensOp ra WHERE ra.ZX_IDEPED = :idcab")
    Integer getNextItem(@Param("idcab") String idcab);
    

}