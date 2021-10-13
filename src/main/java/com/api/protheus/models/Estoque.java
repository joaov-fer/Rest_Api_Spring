
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
@Table(name="sfestoque")
public class Estoque  implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    private String codestsf; 
    private String codprosf;
        
    private String codfil;
    private String codpro;
    private String coddep;
    
    private String nomdep;
    private int qtdest;
    private int qtdres;
    private int qtdcpc;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultalt;
    private String nomfil;
    private String numcgc;
    private String nompro;

    public String getCodestsf() {
        return codestsf;
    }

    public void setCodestsf(String codestsf) {
        this.codestsf = codestsf;
    }

    public String getCodprosf() {
        return codprosf;
    }

    public void setCodprosf(String codprosf) {
        this.codprosf = codprosf;
    }

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

    public String getNomdep() {
        return nomdep;
    }

    public void setNomdep(String nomdep) {
        this.nomdep = nomdep;
    }

    public int getQtdest() {
        return qtdest;
    }

    public void setQtdest(int qtdest) {
        this.qtdest = qtdest;
    }

    public int getQtdres() {
        return qtdres;
    }

    public void setQtdres(int qtdres) {
        this.qtdres = qtdres;
    }

    public int getQtdcpc() {
        return qtdcpc;
    }

    public void setQtdcpc(int qtdcpc) {
        this.qtdcpc = qtdcpc;
    }

    public Date getUltalt() {
        return ultalt;
    }

    public void setUltalt(Date ultalt) {
        this.ultalt = ultalt;
    }

    public String getNomfil() {
        return nomfil;
    }

    public void setNomfil(String nomfil) {
        this.nomfil = nomfil;
    }

    public String getNumcgc() {
        return numcgc;
    }

    public void setNumcgc(String numcgc) {
        this.numcgc = numcgc;
    }

    public String getNompro() {
        return nompro;
    }

    public void setNompro(String nompro) {
        this.nompro = nompro;
    }

    
    
}
