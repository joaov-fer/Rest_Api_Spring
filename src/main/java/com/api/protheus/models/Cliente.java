
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
@Table(name="sfcliente")
public class Cliente implements Serializable{
    
    @Id
    private String codclisf;
    private String codcli;
    private String codlja;
    private String nomcli;
    private String apecli;
    private String tipcli;
    private String tipmer;
    private String cgccpf;
    private String sigufs;
    private String endcli;
    private String cplend;
    private String nompai;
    private String codpai;
    private String cidcli;
    private String cepcli;
    private String foncli;
    private String foncl2;
    private String foncl3;
    private String faxcli;
    private String sitcli;
    private String emacli;
    private double limcred;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultalt;
    private String insest;
    private String codcna;
    private String tipcta;
    private String codven;
    private String codcpg;
    private String riscli;
    private String segcli;
    private String gruven;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datpcp;
    private String descta;
    private String tipfre;
    private int codmoe;
    private String codmun;
    private String cliobs;
    

    public String getCodclisf() {
        return codclisf;
    }

    public void setCodclisf(String codclisf) {
        this.codclisf = codclisf;
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

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getApecli() {
        return apecli;
    }

    public void setApecli(String apecli) {
        this.apecli = apecli;
    }

    public String getTipcli() {
        return tipcli;
    }

    public void setTipcli(String tipcli) {
        this.tipcli = tipcli;
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

    public String getSigufs() {
        return sigufs;
    }

    public void setSigufs(String sigufs) {
        this.sigufs = sigufs;
    }

    public String getEndcli() {
        return endcli;
    }

    public void setEndcli(String endcli) {
        this.endcli = endcli;
    }

    public String getCplend() {
        return cplend;
    }

    public void setCplend(String cplend) {
        this.cplend = cplend;
    }

    public String getNompai() {
        return nompai;
    }

    public void setNompai(String nompai) {
        this.nompai = nompai;
    }

    public String getCodpai() {
        return codpai;
    }

    public void setCodpai(String codpai) {
        this.codpai = codpai;
    }

    public String getCidcli() {
        return cidcli;
    }

    public void setCidcli(String cidcli) {
        this.cidcli = cidcli;
    }

    public String getCepcli() {
        return cepcli;
    }

    public void setCepcli(String cepcli) {
        this.cepcli = cepcli;
    }

    public String getFoncli() {
        return foncli;
    }

    public void setFoncli(String foncli) {
        this.foncli = foncli;
    }

    public String getFoncl2() {
        return foncl2;
    }

    public void setFoncl2(String foncl2) {
        this.foncl2 = foncl2;
    }

    public String getFoncl3() {
        return foncl3;
    }

    public void setFoncl3(String foncl3) {
        this.foncl3 = foncl3;
    }

    public String getFaxcli() {
        return faxcli;
    }

    public void setFaxcli(String faxcli) {
        this.faxcli = faxcli;
    }

    public String getSitcli() {
        return sitcli;
    }

    public void setSitcli(String sitcli) {
        this.sitcli = sitcli;
    }

    public String getEmacli() {
        return emacli;
    }

    public void setEmacli(String emacli) {
        this.emacli = emacli;
    }

    public double getLimcred() {
        return limcred;
    }

    public void setLimcred(double limcred) {
        this.limcred = limcred;
    }

    public Date getUltalt() {
        return ultalt;
    }

    public void setUltalt(Date ultalt) {
        this.ultalt = ultalt;
    }

    public String getInsest() {
        return insest;
    }

    public void setInsest(String insest) {
        this.insest = insest;
    }

    public String getCodcna() {
        return codcna;
    }

    public void setCodcna(String codcna) {
        this.codcna = codcna;
    }

    public String getTipcta() {
        return tipcta;
    }

    public void setTipcta(String tipcta) {
        this.tipcta = tipcta;
    }

    public String getCodven() {
        return codven;
    }

    public void setCodven(String codven) {
        this.codven = codven;
    }

    public String getCodcpg() {
        return codcpg;
    }

    public void setCodcpg(String codcpg) {
        this.codcpg = codcpg;
    }

    public String getRiscli() {
        return riscli;
    }

    public void setRiscli(String riscli) {
        this.riscli = riscli;
    }

    public String getSegcli() {
        return segcli;
    }

    public void setSegcli(String segcli) {
        this.segcli = segcli;
    }

    public String getGruven() {
        return gruven;
    }

    public void setGruven(String gruven) {
        this.gruven = gruven;
    }

    public Date getDatpcp() {
        return datpcp;
    }

    public void setDatpcp(Date datpcp) {
        this.datpcp = datpcp;
    }

    public String getDescta() {
        return descta;
    }

    public void setDescta(String descta) {
        this.descta = descta;
    }

    public String getTipfre() {
        return tipfre;
    }

    public void setTipfre(String tipfre) {
        this.tipfre = tipfre;
    }

    public int getCodmoe() {
        return codmoe;
    }

    public void setCodmoe(int codmoe) {
        this.codmoe = codmoe;
    }

    public String getCodmun() {
        return codmun;
    }

    public void setCodmun(String codmun) {
        this.codmun = codmun;
    }

    public String getCliobs() {
        return cliobs;
    }

    public void setCliobs(String cliobs) {
        this.cliobs = cliobs;
    }


}
