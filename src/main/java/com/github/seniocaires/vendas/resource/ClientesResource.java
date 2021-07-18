package com.github.seniocaires.vendas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.seniocaires.vendas.model.Cliente;
import com.github.seniocaires.vendas.repository.Clientes;

@RestController
@RequestMapping("/clientes")
public class ClientesResource {

	@Autowired
	private Clientes clientes;

	@GetMapping
	public List<Cliente> listar() {
		return clientes.findAll();
	}
}
