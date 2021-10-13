
package com.api.protheus.resource;


import com.api.protheus.models.Pedido;
import com.api.protheus.repository.PedidoRepositoy;
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
@RequestMapping(value="/Pedido")
public class PedidoResource{
	
	
        @Autowired
        PedidoRepositoy pedidoRepositoy;

        @RequestMapping(value = "/get", method = RequestMethod.GET)
        public Page<Pedido> readPageableClientes(
        Pageable pageable,
        @RequestParam(value="ultalt", required = false, defaultValue="1900-01-01 00:00:00") String ultalt) throws ParseException{
                
            Date date =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(ultalt); 
            date = DateUtils.addMinutes(date, - 10);          
            return pedidoRepositoy.findQuery(date, pageable);
		
	}
        

        @RequestMapping(value = "/getdeleteds", method = RequestMethod.GET)
        public Page<Pedido> readDeleteds(
        Pageable pageable,
        @RequestParam(value="ultalt", required = false, defaultValue="1900-01-01 00:00:00") String ultalt) throws ParseException{
                
            Date date =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(ultalt); 
                      
            return pedidoRepositoy.findQueryDeleteds(date, pageable);
		
	}
	
}
