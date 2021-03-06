package com.github.seniocaires.vendas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.seniocaires.vendas.model.Produto;
import com.github.seniocaires.vendas.repository.Produtos;

@RestController
@RequestMapping("/produtos")
public class ProdutosResource {

	@Autowired
	private Produtos produtos;

	@GetMapping
	public List<Produto> listar() {
		return produtos.findAll();
	}
}
