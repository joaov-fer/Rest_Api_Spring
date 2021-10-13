/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Table(name="sffaturamento")
public class Faturamento implements Serializable{
    
    @Id
    private String chvnfe;
    
    private String codfil;
    private String numnfe;
    
    private String tipnfe;
    private String codcli;
    private String cgccpf;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datnfe;
    private double vlrliq;
    private String numped;
    private String sitnfe;
    private String codope;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultalt;
    private String codven;
    private String sernfe;
    
    private double fatdev;
    
    private double fatqtd;
    
    private double devper;
    
    private String codlja;
    private String codclisf;
    
    private String nfnum;
    private String nfser;
        

    public String getChvnfe() {
        return chvnfe;
    }

    public void setChvnfe(String chvnfe) {
        this.chvnfe = chvnfe;
    }

    public String getCodfil() {
        return codfil;
    }

    public void setCodfil(String codfil) {
        this.codfil = codfil;
    }

    public String getNumnfe() {
        return numnfe;
    }

    public void setNumnfe(String numnfe) {
        this.numnfe = numnfe;
    }

    public String getTipnfe() {
        return tipnfe;
    }

    public void setTipnfe(String tipnfe) {
        this.tipnfe = tipnfe;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getCgccpf() {
        return cgccpf;
    }

    public void setCgccpf(String cgccpf) {
        this.cgccpf = cgccpf;
    }

    public Date getDatnfe() {
        return datnfe;
    }

    public void setDatnfe(Date datnfe) {
        this.datnfe = datnfe;
    }

    public double getVlrliq() {
        return vlrliq;
    }

    public void setVlrliq(double vlrliq) {
        this.vlrliq = vlrliq;
    }

    public String getNumped() {
        return numped;
    }

    public void setNumped(String numped) {
        this.numped = numped;
    }

    public String getSitnfe() {
        return sitnfe;
    }

    public void setSitnfe(String sitnfe) {
        this.sitnfe = sitnfe;
    }

    public String getCodope() {
        return codope;
    }

    public void setCodope(String codope) {
        this.codope = codope;
    }

    public Date getUltalt() {
        return ultalt;
    }

    public void setUltalt(Date ultalt) {
        this.ultalt = ultalt;
    }

    public String getCodven() {
        return codven;
    }

    public void setCodven(String codven) {
        this.codven = codven;
    }

    public String getSernfe() {
        return sernfe;
    }

    public void setSernfe(String sernfe) {
        this.sernfe = sernfe;
    }

    public double getFatdev() {
        return fatdev;
    }

    public void setFatdev(double fatdev) {
        this.fatdev = fatdev;
    }

    public double getFatqtd() {
        return fatqtd;
    }

    public void setFatqtd(double fatqtd) {
        this.fatqtd = fatqtd;
    }

    public double getDevper() {
        return devper;
    }

    public void setDevper(double devper) {
        this.devper = devper;
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

    public String getNfnum() {
        return nfnum;
    }

    public void setNfnum(String nfnum) {
        this.nfnum = nfnum;
    }

    public String getNfser() {
        return nfser;
    }

    public void setNfser(String nfser) {
        this.nfser = nfser;
    }

        
}
