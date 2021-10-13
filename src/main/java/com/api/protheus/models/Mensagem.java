
package com.api.protheus.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sfmensagem")
public class Mensagem implements Serializable{
    
    @Id
    private String msgcod;
    
    private String msgdes;
    
    private String msgfor;

    public String getMsgcod() {
        return msgcod;
    }

    public void setMsgcod(String msgcod) {
        this.msgcod = msgcod;
    }

    public String getMsgdes() {
        return msgdes;
    }

    public void setMsgdes(String msgdes) {
        this.msgdes = msgdes;
    }

    public String getMsgfor() {
        return msgfor;
    }

    public void setMsgfor(String msgfor) {
        this.msgfor = msgfor;
    }
    
    
    
    
    
}
