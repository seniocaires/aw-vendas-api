package com.github.seniocaires.vendas.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.seniocaires.vendas.model.Venda;
import com.github.seniocaires.vendas.repository.Produtos;
import com.github.seniocaires.vendas.repository.Vendas;

@Service
public class VendaService {

	@Autowired
	private Vendas vendas;

	@Autowired
	private Produtos produtos;

	public Venda adicionar(Venda venda) {

		venda.setCadastro(LocalDateTime.now());
		venda.getItens().forEach(item -> {
			item.setVenda(venda);
			item.setProduto(produtos.findById(item.getProduto().getId()).get());
		});

		BigDecimal totalItens = venda.getItens().stream() //
				.map(item -> item.getProduto().getValor().multiply(new BigDecimal(item.getQuantidade()))) //
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		venda.setTotal(totalItens);

		return vendas.save(venda);
	}
}
