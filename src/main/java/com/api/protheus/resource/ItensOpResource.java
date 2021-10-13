
package com.api.protheus.resource;

import com.api.protheus.models.ItensOp;
import com.api.protheus.repository.ItensOpRepository;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/ItensOp")
public class ItensOpResource{

            @Autowired
            ItensOpRepository itensopRepository;

            @RequestMapping(value = "/get", method = RequestMethod.GET)
            public Page<ItensOp> readPageableItensOp(
            Pageable pageable,
            @RequestParam(value="idcab", required = false, defaultValue="") String idcab) throws ParseException {
 
                if (idcab.isEmpty()){
                    return itensopRepository.findAll(pageable);
                }else{
                    return itensopRepository.findByIdSf(idcab, pageable);
                }

            }
            
            @RequestMapping(value = "/post", method = RequestMethod.POST)
            public String post(@RequestBody List<ItensOp> body) {
                
                DateFormat dataParse = new SimpleDateFormat("yyyyMMdd");
                DateFormat horaParse = new SimpleDateFormat("HH:mm:ss");
                Date date = new Date();
                String data = dataParse.format(date);
                String hora = horaParse.format(date);
                
                for (ItensOp varr : body){

                    varr.setZX_DATEISF(data);
                    varr.setZX_HORAISF(hora);
                    
                    Integer numIte = itensopRepository.getNextItem(varr.getZX_IDEPED());
                    String seq = String.valueOf(numIte);
                    String seqite = seq.length() == 1 ? "0" + seq : seq;
                    
                    varr.setZX_ITEM(seqite);
                    
                    Long id = itensopRepository.getNextId();
                    varr.setR_E_C_N_O_(id);
                    
                    if(varr.getD_E_L_E_T_() == null){
                        varr.setD_E_L_E_T_("");
                    }
                    
                    varr.setR_E_C_D_E_L_("0");
                    if(varr.getD_E_L_E_T_().trim().equalsIgnoreCase("*")){
                        varr.setR_E_C_D_E_L_(String.valueOf(id));
                    }
                    
                    itensopRepository.save(varr);
                }
                
                    
                return "Criado com sucesso!";
            }
            
            public String nullToEmpty(String s){
                return s == null ? "" : s;
            }
            
            @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
            public String del(
                    @RequestParam(value="idcab", required = true) String idcab) {

                   itensopRepository.deleteItensByIdSf(idcab);
                   return "Deletado com sucesso!";
                        
            }
            

	
}