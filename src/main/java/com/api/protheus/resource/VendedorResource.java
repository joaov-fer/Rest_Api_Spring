package com.api.protheus.resource;

import com.api.protheus.models.Vendedor;
import com.api.protheus.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Vendedor")
public class VendedorResource{
	
	
	@Autowired
	VendedorRepository vendedorRepository;
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public Page<Vendedor> readPageableClientes(
        Pageable pageable){
            
                    return vendedorRepository.findAll(pageable);

		
	}
	
}

