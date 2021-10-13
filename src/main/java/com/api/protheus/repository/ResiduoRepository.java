
package com.api.protheus.repository;

import com.api.protheus.models.Residuo;
import javax.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResiduoRepository extends JpaRepository<Residuo, Long>{
 
    @Query(value = "select u from Residuo u where u.ZW_IDEPED = (:idcab)")
    Page<Residuo> findPed(@Param("idcab") String idcab, Pageable pageable);
    
    String sql4 = "delete from Residuo i where i.ZW_IDEPED = (:idcab)";
    @Modifying
    @Transactional
    @Query(value = sql4)
    void deleteItensByIdSf(@Param("idcab") String idcab);
    
    String sql3 = "select COALESCE(max(R_E_C_N_O_),0)+1 from SZW010"; 
    @Query(value = sql3, nativeQuery = true)
    Long getNextId();
    
       
}