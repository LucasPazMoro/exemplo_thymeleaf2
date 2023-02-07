package br.edu.unoesc.revisao;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerPadrao {
	@RequestMapping("/")
	//@ResponseBody desmarquei o responseBody, para reconhecer o arquivo index.html do return, e não a String "index."
	String home(Model modelo) {
		modelo.addAttribute("mensagem", "info do modelo" );

		Produto p = new Produto("cadeiras", 12, new BigDecimal("500.99"));
		modelo.addAttribute("produto", p);
		
		return "index";
	} 

}
