package com.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class CustomerReview {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@Column (name = "ref_pedido")
	private String pedido;
	@Column (name = "id_produto")
	private String idProduto;
	@Column (name = "tamanho_produto")
	private String tamanho;
	@Column (name = "dados_tamanho")
	private String qtd;
	@Column (name = "valor_total")
	private String valorTotal;
		
	
	
	
}
