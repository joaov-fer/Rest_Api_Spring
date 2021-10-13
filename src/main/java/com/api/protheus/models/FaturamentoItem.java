
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
@Table(name="sffaturamentoitem")
public class FaturamentoItem implements Serializable {

    @Id
    private String chvitemsf;
    private String chvnfe;
    private String codfil;
    private String numnfe;
    private String seqnfe;
    private String numpedsf;
    private String codprosf;
    private String numped;
    private String seqipd;
    private String codpro;
    private String coddep;
    private String sitnfe;
    private String codope;
    private String sernfe;
    private String nfenum;
    private double qtdnfe;
    private double vlruni;
    private double vlrbru;
    private double peripi;
    private double vlripi;
    private double vlrliq;
    private double devqt;
    private double devvl;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="GMT-3")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultalt;

    public String getChvitemsf() {
        return chvitemsf;
    }

    public void setChvitemsf(String chvitemsf) {
        this.chvitemsf = chvitemsf;
    }
    
    
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

    public String getSeqnfe() {
        return seqnfe;
    }

    public void setSeqnfe(String seqnfe) {
        this.seqnfe = seqnfe;
    }

    public String getNumpedsf() {
        return numpedsf;
    }

    public void setNumpedsf(String numpedsf) {
        this.numpedsf = numpedsf;
    }

    public String getCodprosf() {
        return codprosf;
    }

    public void setCodprosf(String codprosf) {
        this.codprosf = codprosf;
    }

    public String getNumped() {
        return numped;
    }

    public void setNumped(String numped) {
        this.numped = numped;
    }

    public String getSeqipd() {
        return seqipd;
    }

    public void setSeqipd(String seqipd) {
        this.seqipd = seqipd;
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

    public String getSernfe() {
        return sernfe;
    }

    public void setSernfe(String sernfe) {
        this.sernfe = sernfe;
    }

    public String getNfenum() {
        return nfenum;
    }

    public void setNfenum(String nfenum) {
        this.nfenum = nfenum;
    }

    public double getQtdnfe() {
        return qtdnfe;
    }

    public void setQtdnfe(double qtdnfe) {
        this.qtdnfe = qtdnfe;
    }

    public double getVlruni() {
        return vlruni;
    }

    public void setVlruni(double vlruni) {
        this.vlruni = vlruni;
    }

    public double getVlrbru() {
        return vlrbru;
    }

    public void setVlrbru(double vlrbru) {
        this.vlrbru = vlrbru;
    }

    public double getPeripi() {
        return peripi;
    }

    public void setPeripi(double peripi) {
        this.peripi = peripi;
    }

    public double getVlripi() {
        return vlripi;
    }

    public void setVlripi(double vlripi) {
        this.vlripi = vlripi;
    }

    public double getVlrliq() {
        return vlrliq;
    }

    public void setVlrliq(double vlrliq) {
        this.vlrliq = vlrliq;
    }

    public double getDevqt() {
        return devqt;
    }

    public void setDevqt(double devqt) {
        this.devqt = devqt;
    }

    public double getDevvl() {
        return devvl;
    }

    public void setDevvl(double devvl) {
        this.devvl = devvl;
    }

    public Date getUltalt() {
        return ultalt;
    }

    public void setUltalt(Date ultalt) {
        this.ultalt = ultalt;
    }


}
