
package com.api.protheus.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;


@Entity
@DynamicInsert
@Table(name="SZU010")
public class PedidoOp implements Serializable {

    
    @Id
    private Long R_E_C_N_O_;
    private String ZU_IDEPED;
    private String ZU_NUMPSF;
    private String ZU_NUM;
    private String ZU_STSFERP;
    private String ZU_DATEISF;
    private String ZU_HORAISF;
    private String ZU_DATEIRP;
    private String ZU_HORAIRP;
    private String ZU_FILIAL;
    private String ZU_CLIENTE;
    private String ZU_LOJACLI;
    private String ZU_TIPOCLI;
    private String ZU_MENNOTA;
    private String ZU_CONDPAG;
    private String ZU_TPFRETE;
    private String ZU_MENPAD;
    private String ZU__CLIENT;
    private String ZU__LOJENT;
    private String ZU__MUNENT;
    private String ZU__ESTENT;
    private String ZU__BAIENT;
    private String ZU__ENDENT;
    
//    @ColumnTransformer(write = "CAST(? as varbinary(max))", read = "CAST(ZU__OUTTRA as VARCHAR(8000))")
//    private String ZU__OUTTRA;
//    @ColumnTransformer(write = "CAST(? as varbinary(max))", read = "CAST(ZU_ERROSF as VARCHAR(8000))")
//    private String ZU_ERROSF;
    
    private byte[] ZU__OUTTRA;
    private byte[] ZU_ERROSF;

    
    //news
    private String ZU_VEND1;
    private String ZU_CLIENT;
    private double ZU_TXMOEDA;
    private double ZU_MOEDA;
   //private String ZU_TPPVSF;
    private String ZU_YPEDCOM;
    private String ZU_EMISSAO;
    private String ZU_TPPVSF;
    private String ZU_PEDNORM;
    private String R_E_C_D_E_L_;
    private String D_E_L_E_T_;
    private String ZU_YCLIIT;
    private String ZU_YLOJIT;
    private String ZU_YFILD;


    public Long getR_E_C_N_O_() {
        return R_E_C_N_O_;
    }

    public void setR_E_C_N_O_(Long R_E_C_N_O_) {
        this.R_E_C_N_O_ = R_E_C_N_O_;
    }

    public String getZU_IDEPED() {
        return ZU_IDEPED;
    }

    public void setZU_IDEPED(String ZU_IDEPED) {
        this.ZU_IDEPED = ZU_IDEPED;
    }

    public String getZU_NUMPSF() {
        return ZU_NUMPSF;
    }

    public void setZU_NUMPSF(String ZU_NUMPSF) {
        this.ZU_NUMPSF = ZU_NUMPSF;
    }

    public String getZU_NUM() {
        return ZU_NUM;
    }

    public void setZU_NUM(String ZU_NUM) {
        this.ZU_NUM = ZU_NUM;
    }

    public String getZU_STSFERP() {
        return ZU_STSFERP;
    }

    public void setZU_STSFERP(String ZU_STSFERP) {
        this.ZU_STSFERP = ZU_STSFERP;
    }

    public String getZU_DATEISF() {
        return ZU_DATEISF;
    }

    public void setZU_DATEISF(String ZU_DATEISF) {
        this.ZU_DATEISF = ZU_DATEISF;
    }

    public String getZU_HORAISF() {
        return ZU_HORAISF;
    }

    public void setZU_HORAISF(String ZU_HORAISF) {
        this.ZU_HORAISF = ZU_HORAISF;
    }

    public String getZU_DATEIRP() {
        return ZU_DATEIRP;
    }

    public void setZU_DATEIRP(String ZU_DATEIRP) {
        this.ZU_DATEIRP = ZU_DATEIRP;
    }

    public String getZU_HORAIRP() {
        return ZU_HORAIRP;
    }

    public void setZU_HORAIRP(String ZU_HORAIRP) {
        this.ZU_HORAIRP = ZU_HORAIRP;
    }

    public String getZU_FILIAL() {
        return ZU_FILIAL;
    }

    public void setZU_FILIAL(String ZU_FILIAL) {
        this.ZU_FILIAL = ZU_FILIAL;
    }

    public String getZU_CLIENTE() {
        return ZU_CLIENTE;
    }

    public void setZU_CLIENTE(String ZU_CLIENTE) {
        this.ZU_CLIENTE = ZU_CLIENTE;
    }

    public String getZU_LOJACLI() {
        return ZU_LOJACLI;
    }

    public void setZU_LOJACLI(String ZU_LOJACLI) {
        this.ZU_LOJACLI = ZU_LOJACLI;
    }

    public String getZU_TIPOCLI() {
        return ZU_TIPOCLI;
    }

    public void setZU_TIPOCLI(String ZU_TIPOCLI) {
        this.ZU_TIPOCLI = ZU_TIPOCLI;
    }

    public String getZU_MENNOTA() {
        return ZU_MENNOTA;
    }

    public void setZU_MENNOTA(String ZU_MENNOTA) {
        this.ZU_MENNOTA = ZU_MENNOTA;
    }

    public String getZU_CONDPAG() {
        return ZU_CONDPAG;
    }

    public void setZU_CONDPAG(String ZU_CONDPAG) {
        this.ZU_CONDPAG = ZU_CONDPAG;
    }

    public String getZU_TPFRETE() {
        return ZU_TPFRETE;
    }

    public void setZU_TPFRETE(String ZU_TPFRETE) {
        this.ZU_TPFRETE = ZU_TPFRETE;
    }

    public String getZU_MENPAD() {
        return ZU_MENPAD;
    }

    public void setZU_MENPAD(String ZU_MENPAD) {
        this.ZU_MENPAD = ZU_MENPAD;
    }

    public String getZU__CLIENT() {
        return ZU__CLIENT;
    }

    public void setZU__CLIENT(String ZU__CLIENT) {
        this.ZU__CLIENT = ZU__CLIENT;
    }

    public String getZU__LOJENT() {
        return ZU__LOJENT;
    }

    public void setZU__LOJENT(String ZU__LOJENT) {
        this.ZU__LOJENT = ZU__LOJENT;
    }

    public String getZU__MUNENT() {
        return ZU__MUNENT;
    }

    public void setZU__MUNENT(String ZU__MUNENT) {
        this.ZU__MUNENT = ZU__MUNENT;
    }

    public String getZU__ESTENT() {
        return ZU__ESTENT;
    }

    public void setZU__ESTENT(String ZU__ESTENT) {
        this.ZU__ESTENT = ZU__ESTENT;
    }

    public String getZU__BAIENT() {
        return ZU__BAIENT;
    }

    public void setZU__BAIENT(String ZU__BAIENT) {
        this.ZU__BAIENT = ZU__BAIENT;
    }

    public String getZU__ENDENT() {
        return ZU__ENDENT;
    }

    public void setZU__ENDENT(String ZU__ENDENT) {
        this.ZU__ENDENT = ZU__ENDENT;
    }

    public byte[] getZU__OUTTRA() {
        return ZU__OUTTRA;
    }

    public void setZU__OUTTRA(byte[] ZU__OUTTRA) {
        this.ZU__OUTTRA = ZU__OUTTRA;
    }

    public byte[] getZU_ERROSF() {
        return ZU_ERROSF;
    }

    public void setZU_ERROSF(byte[] ZU_ERROSF) {
        this.ZU_ERROSF = ZU_ERROSF;
    }


    public String getZU_VEND1() {
        return ZU_VEND1;
    }

    public void setZU_VEND1(String ZU_VEND1) {
        this.ZU_VEND1 = ZU_VEND1;
    }

    public String getZU_CLIENT() {
        return ZU_CLIENT;
    }

    public void setZU_CLIENT(String ZU_CLIENT) {
        this.ZU_CLIENT = ZU_CLIENT;
    }

    public double getZU_TXMOEDA() {
        return ZU_TXMOEDA;
    }

    public void setZU_TXMOEDA(double ZU_TXMOEDA) {
        this.ZU_TXMOEDA = ZU_TXMOEDA;
    }

    public double getZU_MOEDA() {
        return ZU_MOEDA;
    }

    public void setZU_MOEDA(double ZU_MOEDA) {
        this.ZU_MOEDA = ZU_MOEDA;
    }

    public String getZU_YPEDCOM() {
        return ZU_YPEDCOM;
    }

    public void setZU_YPEDCOM(String ZU_YPEDCOM) {
        this.ZU_YPEDCOM = ZU_YPEDCOM;
    }

    public String getZU_EMISSAO() {
        return ZU_EMISSAO;
    }

    public void setZU_EMISSAO(String ZU_EMISSAO) {
        this.ZU_EMISSAO = ZU_EMISSAO;
    }

    public String getZU_TPPVSF() {
        return ZU_TPPVSF;
    }

    public void setZU_TPPVSF(String ZU_TPPVSF) {
        this.ZU_TPPVSF = ZU_TPPVSF;
    }

    public String getZU_PEDNORM() {
        return ZU_PEDNORM;
    }

    public void setZU_PEDNORM(String ZU_PEDNORM) {
        this.ZU_PEDNORM = ZU_PEDNORM;
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

    public String getZU_YCLIIT() {
        return ZU_YCLIIT;
    }

    public void setZU_YCLIIT(String ZU_YCLIIT) {
        this.ZU_YCLIIT = ZU_YCLIIT;
    }

    public String getZU_YLOJIT() {
        return ZU_YLOJIT;
    }

    public void setZU_YLOJIT(String ZU_YLOJIT) {
        this.ZU_YLOJIT = ZU_YLOJIT;
    }

    public String getZU_YFILD() {
        return ZU_YFILD;
    }

    public void setZU_YFILD(String ZU_YFILD) {
        this.ZU_YFILD = ZU_YFILD;
    }
    
    
}
    
    