/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.protheus.models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

@Embeddable
public class PedidoID implements Serializable{
    
    public PedidoID(){}

    public PedidoID(String codfil, String numped, String codlja) {
        this.codfil = codfil;
        this.numped = numped;
        this.codlja = codlja;
    }


    private static final long serialVersionUID = 1L;
    
    private String codfil;
    private String numped;
    private String codlja;

    
    public String getCodlja() {
        return codlja;
    }

    public void setCodlja(String codlja) {
        this.codlja = codlja;
    }
    
    

    public String getCodfil() {
        return codfil;
    }

    public void setCodfil(String codfil) {
        this.codfil = codfil;
    }

    public String getNumped() {
        return numped;
    }

    public void setNumped(String numped) {
        this.numped = numped;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.codfil);
        hash = 59 * hash + Objects.hashCode(this.numped);
        hash = 59 * hash + Objects.hashCode(this.codlja);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PedidoID other = (PedidoID) obj;
        if (!Objects.equals(this.codfil, other.codfil)) {
            return false;
        }
        if (!Objects.equals(this.numped, other.numped)) {
            return false;
        }
        if (!Objects.equals(this.codlja, other.codlja)) {
            return false;
        }
        return true;
    }

    
    
    
}
