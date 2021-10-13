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
class EstoqueID implements Serializable{
    
    public EstoqueID(){}
    
    private static final long serialVersionUID = 1L;

    public EstoqueID(String codfil, String codpro, String coddep) {
        this.codfil = codfil;
        this.codpro = codpro;
        this.coddep = coddep;
    }
    
    private String codfil;
    private String codpro;
    private String coddep;
    
    
    public String getCodfil() {
        return codfil;
    }

    public void setCodfil(String codfil) {
        this.codfil = codfil;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getCoddep() {
        return coddep;
    }

    public void setCoddep(String coddep) {
        this.coddep = coddep;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.codfil);
        hash = 89 * hash + Objects.hashCode(this.codpro);
        hash = 89 * hash + Objects.hashCode(this.coddep);
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
        final EstoqueID other = (EstoqueID) obj;
        if (!Objects.equals(this.codfil, other.codfil)) {
            return false;
        }
        if (!Objects.equals(this.codpro, other.codpro)) {
            return false;
        }
        if (!Objects.equals(this.coddep, other.coddep)) {
            return false;
        }
        return true;
    }


}
