
package com.api.protheus.resource;

import com.api.protheus.models.Residuo;
import com.api.protheus.repository.ResiduoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Residuo")
public class ResiduoResource{

    @Autowired
    ResiduoRepository residuoRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Page<Residuo> read(
    Pageable pageable,
    @RequestParam(value="idcab", required = true) String idcab){
                        
       return residuoRepository.findPed(idcab, pageable);

    }
    

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String post(@RequestBody Residuo body) {
        
        Long id = residuoRepository.getNextId();
        body.setR_E_C_N_O_(id);
        residuoRepository.save(body);

        return "Criado com sucesso!";
    }
    
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String del(@RequestParam(value="idcab", required = true) String idcab) {

        residuoRepository.deleteItensByIdSf(idcab);
        return "Deletado com sucesso!";

    }
		
	
}
