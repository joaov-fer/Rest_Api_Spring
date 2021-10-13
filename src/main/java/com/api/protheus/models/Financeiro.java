
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
@Table(name="sffinanceiro")
public class Financeiro implements Serializable  {
    
    @Id
    private String numtitsf;
    
    private String codfil;
    private String numtit;
    private String numpar;
    private String codcli;
    private String codlja;
    private String codclisf;
    private int codmoe;

    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datemi;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datvct;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datbai;
    private String codven;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultalt;
    private String numped;
    private String numnfe;
    private double vlrtit;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datvcr;
    private String numban;
    private String sittit;
    private String pretit;
    private String chvnfe;
    private String tipdoc;
    
    private double vlrbai;
    private double vlrabe;
    private double vlravd;
    private double vlraav;
    

    public String getNumtitsf() {
        return numtitsf;
    }

    public void setNumtitsf(String numtitsf) {
        this.numtitsf = numtitsf;
    }

    public String getCodfil() {
        return codfil;
    }

    public void setCodfil(String codfil) {
        this.codfil = codfil;
    }

    public String getNumtit() {
        return numtit;
    }

    public void setNumtit(String numtit) {
        this.numtit = numtit;
    }

    public String getNumpar() {
        return numpar;
    }

    public void setNumpar(String numpar) {
        this.numpar = numpar;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getCodlja() {
        return codlja;
    }

    public void setCodlja(String codlja) {
        this.codlja = codlja;
    }

    public String getCodclisf() {
        return codclisf;
    }

    public void setCodclisf(String codclisf) {
        this.codclisf = codclisf;
    }

    public int getCodmoe() {
        return codmoe;
    }

    public void setCodmoe(int codmoe) {
        this.codmoe = codmoe;
    }

    public Date getDatemi() {
        return datemi;
    }

    public void setDatemi(Date datemi) {
        this.datemi = datemi;
    }

    public Date getDatvct() {
        return datvct;
    }

    public void setDatvct(Date datvct) {
        this.datvct = datvct;
    }

    public Date getDatbai() {
        return datbai;
    }

    public void setDatbai(Date datbai) {
        this.datbai = datbai;
    }

    public String getCodven() {
        return codven;
    }

    public void setCodven(String codven) {
        this.codven = codven;
    }

    public Date getUltalt() {
        return ultalt;
    }

    public void setUltalt(Date ultalt) {
        this.ultalt = ultalt;
    }

    public String getNumped() {
        return numped;
    }

    public void setNumped(String numped) {
        this.numped = numped;
    }

    public String getNumnfe() {
        return numnfe;
    }

    public void setNumnfe(String numnfe) {
        this.numnfe = numnfe;
    }

    public double getVlrtit() {
        return vlrtit;
    }

    public void setVlrtit(double vlrtit) {
        this.vlrtit = vlrtit;
    }

    public Date getDatvcr() {
        return datvcr;
    }

    public void setDatvcr(Date datvcr) {
        this.datvcr = datvcr;
    }

    public String getNumban() {
        return numban;
    }

    public void setNumban(String numban) {
        this.numban = numban;
    }

    public String getSittit() {
        return sittit;
    }

    public void setSittit(String sittit) {
        this.sittit = sittit;
    }

    public String getPretit() {
        return pretit;
    }

    public void setPretit(String pretit) {
        this.pretit = pretit;
    }

    public double getVlrbai() {
        return vlrbai;
    }

    public void setVlrbai(double vlrbai) {
        this.vlrbai = vlrbai;
    }

    public double getVlrabe() {
        return vlrabe;
    }

    public void setVlrabe(double vlrabe) {
        this.vlrabe = vlrabe;
    }

    public String getChvnfe() {
        return chvnfe;
    }

    public void setChvnfe(String chvnfe) {
        this.chvnfe = chvnfe;
    }

    public String getTipdoc() {
        return tipdoc;
    }

    public void setTipdoc(String tipdoc) {
        this.tipdoc = tipdoc;
    }

    public double getVlravd() {
        return vlravd;
    }

    public void setVlravd(double vlravd) {
        this.vlravd = vlravd;
    }

    public double getVlraav() {
        return vlraav;
    }

    public void setVlraav(double vlraav) {
        this.vlraav = vlraav;
    }
    
    
    
}
