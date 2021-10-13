
package com.api.protheus.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;

@Entity
@DynamicInsert
@Table(name="SZW010")
public class Residuo implements Serializable {

    @Id
    private Long R_E_C_N_O_;
    private String ZW_FILIAL;
    private String ZW_IDEPED;
    private String ZW_NUMPSF;
    private String ZW_PEDIDO;
    private String ZW_STSFERP;
    private String ZW_IDUSUSF;

    public String getZW_FILIAL() {
        return ZW_FILIAL;
    }

    public void setZW_FILIAL(String ZW_FILIAL) {
        this.ZW_FILIAL = ZW_FILIAL;
    }

    public String getZW_IDEPED() {
        return ZW_IDEPED;
    }

    public void setZW_IDEPED(String ZW_IDEPED) {
        this.ZW_IDEPED = ZW_IDEPED;
    }

    public String getZW_NUMPSF() {
        return ZW_NUMPSF;
    }

    public void setZW_NUMPSF(String ZW_NUMPSF) {
        this.ZW_NUMPSF = ZW_NUMPSF;
    }

    public String getZW_PEDIDO() {
        return ZW_PEDIDO;
    }

    public void setZW_PEDIDO(String ZW_PEDIDO) {
        this.ZW_PEDIDO = ZW_PEDIDO;
    }

    public String getZW_STSFERP() {
        return ZW_STSFERP;
    }

    public void setZW_STSFERP(String ZW_STSFERP) {
        this.ZW_STSFERP = ZW_STSFERP;
    }


    public Long getR_E_C_N_O_() {
        return R_E_C_N_O_;
    }

    public void setR_E_C_N_O_(Long R_E_C_N_O_) {
        this.R_E_C_N_O_ = R_E_C_N_O_;
    }

    public String getZW_IDUSUSF() {
        return ZW_IDUSUSF;
    }

    public void setZW_IDUSUSF(String ZW_IDUSUSF) {
        this.ZW_IDUSUSF = ZW_IDUSUSF;
    }
    

}