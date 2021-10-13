
package com.api.protheus.resource;

import com.api.protheus.models.Mensagem;
import com.api.protheus.repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Mensagem")
public class MensagemResource{

	@Autowired
	MensagemRepository mensagemRepository;

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public Page<Mensagem> readPageableMensagem(
        Pageable pageable) {
            
            return mensagemRepository.findAll(pageable);
		
	}
	
}
