package br.edu.unoesc.revisao;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //gerar os geters e setters
@AllArgsConstructor // gera os construtores
public class Produto {
	private String nome;
	private Integer quantidade;
	private BigDecimal valor;
}





