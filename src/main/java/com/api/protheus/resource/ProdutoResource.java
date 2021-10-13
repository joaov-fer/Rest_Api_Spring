
package com.api.protheus.resource;

import com.api.protheus.models.Produto;
import com.api.protheus.repository.ProdutoRepository;
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
@RequestMapping(value="/Produto")
public class ProdutoResource{
	
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public Page<Produto> readPageableClientes(
        Pageable pageable,
        @RequestParam(value="ultalt", required = false, defaultValue="1900-01-01 00:00:00") String ultalt) throws ParseException{

            Date date =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(ultalt); 

            return produtoRepository.findQuery(date, pageable);
		
	}
	
}


