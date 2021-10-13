
package com.api.protheus.resource;

import com.api.protheus.models.PedidoOp;
import com.api.protheus.repository.ItensOpRepository;
import com.api.protheus.repository.PedidoOpRepository;
import java.text.DateFormat;
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
@RequestMapping(value="/PedidoOp")
public class PedidoOpResource{

            @Autowired
            PedidoOpRepository pedidoopRepository;
            
            @Autowired
            ItensOpRepository itensopRepository;

            @RequestMapping(value = "/get", method = RequestMethod.GET)
            public Page<PedidoOp> get(
            Pageable pageable,
            @RequestParam(value="idcab", required = false, defaultValue="") String idcab){
                
                if (idcab.isEmpty()){
                    return pedidoopRepository.findAll(pageable);
                }
                else if (idcab.equalsIgnoreCase("null")){
                    return pedidoopRepository.findNulls(pageable);
                }
                else{
                    return pedidoopRepository.findByIdSf(idcab, pageable);
                }
                   
              
            }
            
          
            @RequestMapping(value = "/post", method = RequestMethod.POST)
            public String post(@RequestBody PedidoOp body) {
                
                DateFormat dataParse = new SimpleDateFormat("yyyyMMdd");
                DateFormat horaParse = new SimpleDateFormat("HH:mm:ss");
                Date date = new Date();
                String data = dataParse.format(date);
                String hora = horaParse.format(date);
                    
                body.setZU_DATEISF(data);
                body.setZU_HORAISF(hora);

                Long id = pedidoopRepository.getNextId();
                body.setR_E_C_N_O_(id);

                pedidoopRepository.save(body);

                return "Criado com sucesso!";
            }
            
            @RequestMapping(value = "/postmassivo", method = RequestMethod.POST)
            public String postMassa(@RequestBody List<PedidoOp> bodys) {
                
                DateFormat dataParse = new SimpleDateFormat("yyyyMMdd");
                DateFormat horaParse = new SimpleDateFormat("HH:mm:ss");
                Date date = new Date();
                String data = dataParse.format(date);
                String hora = horaParse.format(date);
                
    
                for(PedidoOp body : bodys){

                    body.setZU_DATEISF(data);
                    body.setZU_HORAISF(hora);

                    Long id = pedidoopRepository.getNextId();
                    body.setR_E_C_N_O_(id);
                    
                    if(body.getD_E_L_E_T_() == null){
                        body.setD_E_L_E_T_("");
                    }
                    
                    body.setR_E_C_D_E_L_("0");
                    if(body.getD_E_L_E_T_().trim().equalsIgnoreCase("*")){
                        body.setR_E_C_D_E_L_(String.valueOf(id));
                    }
                    
                    pedidoopRepository.save(body);
                    
                }
           
                return "Criado com sucesso!";
            }
            
            

          
            @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
            public String del(@RequestParam(value="idcab", required = true) String idcab) {

                   pedidoopRepository.deleteItensByIdSf(idcab);
                   return "Deletado com sucesso!";
                        
            }
            
            @RequestMapping(value = "/deletemassivo", method = RequestMethod.DELETE)
            public String delMassivoCabItem(@RequestBody List<String> bodys) {
                
                for(String s : bodys){
                  pedidoopRepository.deleteItensByIdSf(s);
                  itensopRepository.deleteItensByIdSf(s);
                }
                  
                return "Deletado com sucesso!";
                        
            }

            
            
            public String nullToEmpty(String s){
                return s == null ? "" : s;
            }
           
	
}