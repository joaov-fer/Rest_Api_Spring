
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
@Table(name="sfpedido")
public class Pedido implements Serializable {

    @Id
    private String numpedsf;
    private String idcabsf;
    private String codfil;
    private String numped;
    private String tipped;
    private String codcli;
    private String codcpg;
    private double codmoe;
    private double vlrliq;
    private String codven;
    private String sitped;
    private String codlja;
    private String codclisf;
    private String codmsn;
    private String nfmsg;
    private String ciffob;
    private String ctaent;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultalt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datemi;


    public String getNumpedsf() {
        return numpedsf;
    }

    public void setNumpedsf(String numpedsf) {
        this.numpedsf = numpedsf;
    }

    public String getIdcabsf() {
        return idcabsf;
    }

    public void setIdcabsf(String idcabsf) {
        this.idcabsf = idcabsf;
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

    public String getTipped() {
        return tipped;
    }

    public void setTipped(String tipped) {
        this.tipped = tipped;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getCodcpg() {
        return codcpg;
    }

    public void setCodcpg(String codcpg) {
        this.codcpg = codcpg;
    }

    public double getCodmoe() {
        return codmoe;
    }

    public void setCodmoe(double codmoe) {
        this.codmoe = codmoe;
    }

    public double getVlrliq() {
        return vlrliq;
    }

    public void setVlrliq(double vlrliq) {
        this.vlrliq = vlrliq;
    }

    public String getCodven() {
        return codven;
    }

    public void setCodven(String codven) {
        this.codven = codven;
    }

    public String getSitped() {
        return sitped;
    }

    public void setSitped(String sitped) {
        this.sitped = sitped;
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

    public String getCodmsn() {
        return codmsn;
    }

    public void setCodmsn(String codmsn) {
        this.codmsn = codmsn;
    }

    public String getNfmsg() {
        return nfmsg;
    }

    public void setNfmsg(String nfmsg) {
        this.nfmsg = nfmsg;
    }

    public String getCiffob() {
        return ciffob;
    }

    public void setCiffob(String ciffob) {
        this.ciffob = ciffob;
    }

    public Date getUltalt() {
        return ultalt;
    }

    public void setUltalt(Date ultalt) {
        this.ultalt = ultalt;
    }

    public Date getDatemi() {
        return datemi;
    }

    public void setDatemi(Date datemi) {
        this.datemi = datemi;
    }

    public String getCtaent() {
        return ctaent;
    }

    public void setCtaent(String ctaent) {
        this.ctaent = ctaent;
    }

           
}
//    @OneToMany( targetEntity=ItemPed.class, cascade=CascadeType.ALL)
//    @JoinColumn(name="numpedsf", referencedColumnName = "numpedsf")
//    private List<ItemPed> itemPed;

 
