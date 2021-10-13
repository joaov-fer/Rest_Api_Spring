
package com.api.protheus.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sfcondpag")
public class CondicaoPagamento implements Serializable{
    
    @Id
    private String pgtcod;	
            
    private String pgtdes;

    public String getPgtcod() {
        return pgtcod;
    }

    public void setPgtcod(String pgtcod) {
        this.pgtcod = pgtcod;
    }

    public String getPgtdes() {
        return pgtdes;
    }

    public void setPgtdes(String pgtdes) {
        this.pgtdes = pgtdes;
    }
    
 
    
    
}

