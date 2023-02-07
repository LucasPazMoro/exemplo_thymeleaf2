package br.edu.unoesc.revisao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // o Rest já manda retornar o que está dentro do return, não precisa do @responsyBody
public class ControllerRest {
	@RequestMapping("/rest")
	String home() {
		return "<h3>olá mundo!</h3>";
	}
	
	@GetMapping("/rest/ola") //@getMapping especifica diz que vai pelo método GET,  mas podia usar o @requesrMapping igual o de cima.
	public String ola(@RequestParam(value ="nome", defaultValue ="Mundo!!!") String nome) {
		return String.format("Hello %s", nome);
		
	}
	

}
