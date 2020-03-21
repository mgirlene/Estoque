package com.mballem.curso.boot.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "Produtos")
public class Produto extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true)
	private String nome;
	
	@Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal preco;
	
	@Column(nullable = false, unique = true)
	private int quantidade;
	
	@Column(name = "data_validade", nullable = false, columnDefinition = "DATE")
	private LocalDate dataValidade;
}
