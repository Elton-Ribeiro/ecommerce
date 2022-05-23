package com.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class CustomerReview {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@Column (name = "REF_PEDIDO")
	private String pedido;
	@Column (name = "PRODUTO")
	private String produto;
	@Column (name = "TAMANHO_PRODUTO")
	private String tamanho;
	@Column (name = "QTD")
	private String qtd;
	@Column (name = "VALOR_TOTAL")
	private String valorTotal;
		
	
	
	
}
