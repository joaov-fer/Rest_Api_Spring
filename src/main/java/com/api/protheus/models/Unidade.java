
package com.api.protheus.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sfunidade")
public class Unidade implements Serializable {

       @Id
       private String codfil;
       private String tipreg;
       private String cgccpf;
       private String name;
       private String nomcta;
       private String insest;
       private String status;
       private String nompai;
       private String sigufs;
       private String endcta;
       private String baicta;
       private String cidcta;
       private String telcta;
       

    public String getCodfil() {
        return codfil;
    }

    public void setCodfil(String codfil) {
        this.codfil = codfil;
    }

    public String getTipreg() {
        return tipreg;
    }

    public void setTipreg(String tipreg) {
        this.tipreg = tipreg;
    }

    public String getCgccpf() {
        return cgccpf;
    }

    public void setCgccpf(String cgccpf) {
        this.cgccpf = cgccpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNomcta() {
        return nomcta;
    }

    public void setNomcta(String nomcta) {
        this.nomcta = nomcta;
    }

    public String getInsest() {
        return insest;
    }

    public void setInsest(String insest) {
        this.insest = insest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNompai() {
        return nompai;
    }

    public void setNompai(String nompai) {
        this.nompai = nompai;
    }

    public String getSigufs() {
        return sigufs;
    }

    public void setSigufs(String sigufs) {
        this.sigufs = sigufs;
    }

    public String getEndcta() {
        return endcta;
    }

    public void setEndcta(String endcta) {
        this.endcta = endcta;
    }

    public String getBaicta() {
        return baicta;
    }

    public void setBaicta(String baicta) {
        this.baicta = baicta;
    }

    public String getCidcta() {
        return cidcta;
    }

    public void setCidcta(String cidcta) {
        this.cidcta = cidcta;
    }

    public String getTelcta() {
        return telcta;
    }

    public void setTelcta(String telcta) {
        this.telcta = telcta;
    }
       
       
       

}