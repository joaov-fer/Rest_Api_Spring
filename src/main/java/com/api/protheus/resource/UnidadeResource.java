
package com.api.protheus.resource;

import com.api.protheus.models.Unidade;
import com.api.protheus.repository.UnidadeRepository;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Unidade")
public class UnidadeResource{

            @Autowired
            UnidadeRepository unidadeRepository;

            @RequestMapping(value = "/get", method = RequestMethod.GET)
            public Page<Unidade> readPageableUnidade(
            Pageable pageable) {
            
                return unidadeRepository.findAll(pageable);
		
            }
	
}
