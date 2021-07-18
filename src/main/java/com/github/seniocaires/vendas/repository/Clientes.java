package com.github.seniocaires.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.seniocaires.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{

}
