
package com.api.protheus.models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

@Embeddable
public class FinanceiroID implements Serializable{
    
    public FinanceiroID(){}
    
    private static final long serialVersionUID = 1L;

    public FinanceiroID(String codfil, String numtit, String numpar, String codcli, String codlja) {
        this.codfil = codfil;
        this.numtit = numtit;
        this.numpar = numpar;
        this.codcli = codcli;
        this.codlja = codlja;
    }
    
    private String codfil;
    private String numtit;
    private String numpar;
    private String codcli;
    private String codlja;

    public String getCodfil() {
        return codfil;
    }

    public void setCodfil(String codfil) {
        this.codfil = codfil;
    }

    public String getNumtit() {
        return numtit;
    }

    public void setNumtit(String numtit) {
        this.numtit = numtit;
    }

    public String getNumpar() {
        return numpar;
    }

    public void setNumpar(String numpar) {
        this.numpar = numpar;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.codfil);
        hash = 17 * hash + Objects.hashCode(this.numtit);
        hash = 17 * hash + Objects.hashCode(this.numpar);
        hash = 17 * hash + Objects.hashCode(this.codcli);
        hash = 17 * hash + Objects.hashCode(this.codlja);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FinanceiroID other = (FinanceiroID) obj;
        if (!Objects.equals(this.codfil, other.codfil)) {
            return false;
        }
        if (!Objects.equals(this.numtit, other.numtit)) {
            return false;
        }
        if (!Objects.equals(this.numpar, other.numpar)) {
            return false;
        }
        if (!Objects.equals(this.codcli, other.codcli)) {
            return false;
        }
        if (!Objects.equals(this.codlja, other.codlja)) {
            return false;
        }
        return true;
    }

    
}
