
package com.api.protheus.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="sfproduto")
public class Produto implements Serializable {
    
    
    @Id
    private String codprosf;
    
    private String codpro;
    private String nompro;
    private String unimed;
    private String sitpro;
    private String despro;
    private String codgru;
    private String desgru;
    private String ctrlot;
    private double peripi;
    private String tippro;
    private String clafis;
    private String lotuni;
    private double pesbas;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultalt;

    public String getCodprosf() {
        return codprosf;
    }

    public void setCodprosf(String codprosf) {
        this.codprosf = codprosf;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getNompro() {
        return nompro;
    }

    public void setNompro(String nompro) {
        this.nompro = nompro;
    }

    public String getUnimed() {
        return unimed;
    }

    public void setUnimed(String unimed) {
        this.unimed = unimed;
    }

    public String getSitpro() {
        return sitpro;
    }

    public void setSitpro(String sitpro) {
        this.sitpro = sitpro;
    }

    public String getDespro() {
        return despro;
    }

    public void setDespro(String despro) {
        this.despro = despro;
    }

    public String getCodgru() {
        return codgru;
    }

    public void setCodgru(String codgru) {
        this.codgru = codgru;
    }

    public String getDesgru() {
        return desgru;
    }

    public void setDesgru(String desgru) {
        this.desgru = desgru;
    }

    public String getCtrlot() {
        return ctrlot;
    }

    public void setCtrlot(String ctrlot) {
        this.ctrlot = ctrlot;
    }

    public double getPeripi() {
        return peripi;
    }

    public void setPeripi(double peripi) {
        this.peripi = peripi;
    }

    public String getTippro() {
        return tippro;
    }

    public void setTippro(String tippro) {
        this.tippro = tippro;
    }

    public String getClafis() {
        return clafis;
    }

    public void setClafis(String clafis) {
        this.clafis = clafis;
    }

    public String getLotuni() {
        return lotuni;
    }

    public void setLotuni(String lotuni) {
        this.lotuni = lotuni;
    }

    public Date getUltalt() {
        return ultalt;
    }

    public void setUltalt(Date ultalt) {
        this.ultalt = ultalt;
    }

    public double getPesbas() {
        return pesbas;
    }

    public void setPesbas(double pesbas) {
        this.pesbas = pesbas;
    }
    
    
}
