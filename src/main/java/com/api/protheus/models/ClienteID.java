
package com.api.protheus.models;

import java.io.Serializable;
import java.util.Objects;


public class ClienteID implements Serializable{
    
    private ClienteID(){}
    
    private String codcli;
    private String codlja;

    public ClienteID(String codcli, String codlja) {
        this.codcli = codcli;
        this.codlja = codlja;
    }
    
    private static final long serialVersionUID = 1L;

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
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.codcli);
        hash = 79 * hash + Objects.hashCode(this.codlja);
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
        final ClienteID other = (ClienteID) obj;
        if (!Objects.equals(this.codcli, other.codcli)) {
            return false;
        }
        if (!Objects.equals(this.codlja, other.codlja)) {
            return false;
        }
        return true;
    }
    

}
