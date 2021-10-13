
package com.api.protheus.resource;

import com.api.protheus.models.CondicaoPagamento;
import com.api.protheus.repository.CondicaoPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/CondPag")
public class CondicaoPagamentoResource{

	@Autowired
	CondicaoPagamentoRepository condicaopagamentoRepository;

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public Page<CondicaoPagamento> readPageableCondicaoPagamento(
        Pageable pageable){
            
                return condicaopagamentoRepository.findAll(pageable);

	}
	
}
