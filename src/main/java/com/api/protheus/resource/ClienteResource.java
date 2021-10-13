package com.api.protheus.resource;

import com.api.protheus.models.Cliente;
import com.api.protheus.repository.ClienteRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Cliente")
public class ClienteResource{
	
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public Page<Cliente> readPageableClientes(
        Pageable pageable,
        @RequestParam(value="ultalt", required = false, defaultValue="1900-01-01 00:00:00") String ultalt) throws ParseException{
                
            Date date =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(ultalt); 
                      
            return clienteRepository.findQuery(date, pageable);
            
		
	}
	
}