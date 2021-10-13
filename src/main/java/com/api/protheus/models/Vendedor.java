
package com.api.protheus.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sfvendedor")
public class Vendedor implements Serializable{
    
    @Id
    private String codven;
    
    private String nomven;
    private String apeven;
    private String tipven;
    private String tipmer;
    private String cgccpf;
    private String codusu;
    private String codsup;
    private String nomsup;
    private String codger;
    private String nomger;
    private String emaven;

    public String getCodven() {
        return codven;
    }

    public void setCodven(String codven) {
        this.codven = codven;
    }

    public String getNomven() {
        return nomven;
    }

    public void setNomven(String nomven) {
        this.nomven = nomven;
    }

    public String getApeven() {
        return apeven;
    }

    public void setApeven(String apeven) {
        this.apeven = apeven;
    }

    public String getTipven() {
        return tipven;
    }

    public void setTipven(String tipven) {
        this.tipven = tipven;
    }

    public String getTipmer() {
        return tipmer;
    }

    public void setTipmer(String tipmer) {
        this.tipmer = tipmer;
    }

    public String getCgccpf() {
        return cgccpf;
    }

    public void setCgccpf(String cgccpf) {
        this.cgccpf = cgccpf;
    }

    public String getCodusu() {
        return codusu;
    }

    public void setCodusu(String codusu) {
        this.codusu = codusu;
    }

    public String getCodsup() {
        return codsup;
    }

    public void setCodsup(String codsup) {
        this.codsup = codsup;
    }

    public String getNomsup() {
        return nomsup;
    }

    public void setNomsup(String nomsup) {
        this.nomsup = nomsup;
    }

    public String getCodger() {
        return codger;
    }

    public void setCodger(String codger) {
        this.codger = codger;
    }

    public String getNomger() {
        return nomger;
    }

    public void setNomger(String nomger) {
        this.nomger = nomger;
    }

    public String getEmaven() {
        return emaven;
    }

    public void setEmaven(String emaven) {
        this.emaven = emaven;
    }
    
    
    
}
