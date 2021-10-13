
package com.api.protheus.models;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;


@Entity
@DynamicInsert
@Table(name="SZX010")
public class ItensOp implements Serializable {

    @Id
    private Long R_E_C_N_O_;
    private String ZX_IDEPED;
    private String ZX_IDEPEDI;
    private String ZX_NUMPSF;
    private String ZX_NUM;
    private String ZX_FILIAL;
    private String ZX_ITEM;
    private String ZX_PRODUTO;
    private String ZX_ENTREG;
    private Double ZX_QTDVEN;
    private Double ZX_PRCVEN;
    private String ZX_HORAISF;
    private String ZX_DATEISF;
    
    //news
    private Double ZX_VALDESC;
    private Double ZX_VALOR;
    private String ZX_NUMPCOM;
    private String ZX_ITEMPC;
    private String ZX_LOCAL;
    private String ZX_PVSF;
    
    private String R_E_C_D_E_L_;
    private String D_E_L_E_T_;
    private String ZX_STSFERP;


    public Long getR_E_C_N_O_() {
        return R_E_C_N_O_;
    }

    public void setR_E_C_N_O_(Long R_E_C_N_O_) {
        this.R_E_C_N_O_ = R_E_C_N_O_;
    }

    public String getZX_IDEPED() {
        return ZX_IDEPED;
    }

    public void setZX_IDEPED(String ZX_IDEPED) {
        this.ZX_IDEPED = ZX_IDEPED;
    }

    public String getZX_NUMPSF() {
        return ZX_NUMPSF;
    }

    public void setZX_NUMPSF(String ZX_NUMPSF) {
        this.ZX_NUMPSF = ZX_NUMPSF;
    }

    public String getZX_NUM() {
        return ZX_NUM;
    }

    public void setZX_NUM(String ZX_NUM) {
        this.ZX_NUM = ZX_NUM;
    }

    public String getZX_FILIAL() {
        return ZX_FILIAL;
    }

    public void setZX_FILIAL(String ZX_FILIAL) {
        this.ZX_FILIAL = ZX_FILIAL;
    }

    public String getZX_ITEM() {
        return ZX_ITEM;
    }

    public void setZX_ITEM(String ZX_ITEM) {
        this.ZX_ITEM = ZX_ITEM;
    }

    public String getZX_PRODUTO() {
        return ZX_PRODUTO;
    }

    public void setZX_PRODUTO(String ZX_PRODUTO) {
        this.ZX_PRODUTO = ZX_PRODUTO;
    }

    public String getZX_ENTREG() {
        return ZX_ENTREG;
    }

    public void setZX_ENTREG(String ZX_ENTREG) {
        this.ZX_ENTREG = ZX_ENTREG;
    }

    public double getZX_QTDVEN() {
        return ZX_QTDVEN;
    }

    public void setZX_QTDVEN(double ZX_QTDVEN) {
        this.ZX_QTDVEN = ZX_QTDVEN;
    }

    public double getZX_PRCVEN() {
        return ZX_PRCVEN;
    }

    public void setZX_PRCVEN(double ZX_PRCVEN) {
        this.ZX_PRCVEN = ZX_PRCVEN;
    }

    public String getZX_HORAISF() {
        return ZX_HORAISF;
    }

    public void setZX_HORAISF(String ZX_HORAISF) {
        this.ZX_HORAISF = ZX_HORAISF;
    }

    public String getZX_DATEISF() {
        return ZX_DATEISF;
    }

    public void setZX_DATEISF(String ZX_DATEISF) {
        this.ZX_DATEISF = ZX_DATEISF;
    }

    public double getZX_VALDESC() {
        return ZX_VALDESC;
    }

    public void setZX_VALDESC(double ZX_VALDESC) {
        this.ZX_VALDESC = ZX_VALDESC;
    }

    public double getZX_VALOR() {
        return ZX_VALOR;
    }

    public void setZX_VALOR(double ZX_VALOR) {
        this.ZX_VALOR = ZX_VALOR;
    }

    public String getZX_NUMPCOM() {
        return ZX_NUMPCOM;
    }

    public void setZX_NUMPCOM(String ZX_NUMPCOM) {
        this.ZX_NUMPCOM = ZX_NUMPCOM;
    }

    public String getZX_ITEMPC() {
        return ZX_ITEMPC;
    }

    public void setZX_ITEMPC(String ZX_ITEMPC) {
        this.ZX_ITEMPC = ZX_ITEMPC;
    }

    public String getZX_LOCAL() {
        return ZX_LOCAL;
    }

    public void setZX_LOCAL(String ZX_LOCAL) {
        this.ZX_LOCAL = ZX_LOCAL;
    }

    public String getZX_IDEPEDI() {
        return ZX_IDEPEDI;
    }

    public void setZX_IDEPEDI(String ZX_IDEPEDI) {
        this.ZX_IDEPEDI = ZX_IDEPEDI;
    }

    public String getZX_PVSF() {
        return ZX_PVSF;
    }

    public void setZX_PVSF(String ZX_PVSF) {
        this.ZX_PVSF = ZX_PVSF;
    }

    public String getR_E_C_D_E_L_() {
        return R_E_C_D_E_L_;
    }

    public void setR_E_C_D_E_L_(String R_E_C_D_E_L_) {
        this.R_E_C_D_E_L_ = R_E_C_D_E_L_;
    }

    public String getD_E_L_E_T_() {
        return D_E_L_E_T_;
    }

    public void setD_E_L_E_T_(String D_E_L_E_T_) {
        this.D_E_L_E_T_ = D_E_L_E_T_;
    }

    public String getZX_STSFERP() {
        return ZX_STSFERP;
    }

    public void setZX_STSFERP(String ZX_STSFERP) {
        this.ZX_STSFERP = ZX_STSFERP;
    }
    
    
    
       
    
    
}