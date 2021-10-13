/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.protheus.resource;

import com.api.protheus.models.Faturamento;
import com.api.protheus.repository.FaturamentoRepositoy;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Faturamento")
public class FaturamentoResource {
@Autowired
	FaturamentoRepositoy faturamentoRepositoy;
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public Page<Faturamento> readPageableClientes(
            Pageable pageable,
            @RequestParam(value="ultalt", required = false, defaultValue="1900-01-01 00:00:00") String ultalt) throws ParseException{
                
                Date date =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(ultalt);  
                date = DateUtils.addMinutes(date, - 10); 
                return faturamentoRepositoy.findQuery(date,pageable);
		
	}
        
        @RequestMapping(value = "/getdeleteds", method = RequestMethod.GET)
	public Page<Faturamento> getDeleFaturamentos(
            Pageable pageable,
            @RequestParam(value="ultalt", required = false, defaultValue="1900-01-01 00:00:00") String ultalt) throws ParseException{
                
                Date date =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(ultalt);  
                
                return faturamentoRepositoy.findQueryDeleteds(date,pageable);
		
	}

	
}
