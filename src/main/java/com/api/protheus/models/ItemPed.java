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
@Table(name="sfpedidoit" )
public class ItemPed  implements Serializable{
    
    @Id
    private String itepedsf;
    
    private String codfil;
    private String numped;
    private String codcli;
    private String codlja;
    private String  numpedsf;
    private String seqite;
    private String codpro;
    private String  codprosf;
    private String coddep;
    private double vlrunit;
    private double qtdped;
    private double qtdfat;
    private double qtdabe;
    private String sitres;
    private Double qtdemb;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datfat;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultalt;
    
    private String idcabsf;
    
    private String iditesf;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datent;

    public String getItepedsf() {
        return itepedsf;
    }

    public void setItepedsf(String itepedsf) {
        this.itepedsf = itepedsf;
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

    public String getNumpedsf() {
        return numpedsf;
    }

    public void setNumpedsf(String numpedsf) {
        this.numpedsf = numpedsf;
    }

    public String getSeqite() {
        return seqite;
    }

    public void setSeqite(String seqite) {
        this.seqite = seqite;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getCodprosf() {
        return codprosf;
    }

    public void setCodprosf(String codprosf) {
        this.codprosf = codprosf;
    }

    public String getCoddep() {
        return coddep;
    }

    public void setCoddep(String coddep) {
        this.coddep = coddep;
    }

    public double getVlrunit() {
        return vlrunit;
    }

    public void setVlrunit(double vlrunit) {
        this.vlrunit = vlrunit;
    }

    public double getQtdped() {
        return qtdped;
    }

    public void setQtdped(double qtdped) {
        this.qtdped = qtdped;
    }

    public double getQtdfat() {
        return qtdfat;
    }

    public void setQtdfat(double qtdfat) {
        this.qtdfat = qtdfat;
    }

    public double getQtdabe() {
        return qtdabe;
    }

    public void setQtdabe(double qtdabe) {
        this.qtdabe = qtdabe;
    }

    public Date getUltalt() {
        return ultalt;
    }

    public void setUltalt(Date ultalt) {
        this.ultalt = ultalt;
    }

    public Date getDatfat() {
        return datfat;
    }

    public void setDatfat(Date datfat) {
        this.datfat = datfat;
    }

    public String getIdcabsf() {
        return idcabsf;
    }

    public void setIdcabsf(String idcabsf) {
        this.idcabsf = idcabsf;
    }

    public String getIditesf() {
        return iditesf;
    }

    public void setIditesf(String iditesf) {
        this.iditesf = iditesf;
    }

    public String getSitres() {
        return sitres;
    }

    public void setSitres(String sitres) {
        this.sitres = sitres;
    }

    public Date getDatent() {
        return datent;
    }

    public void setDatent(Date datent) {
        this.datent = datent;
    }

    public Double getQtdemb() {
        return qtdemb;
    }

    public void setQtdemb(Double qtdemb) {
        this.qtdemb = qtdemb;
    }
    
    

}
