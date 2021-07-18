package com.github.seniocaires.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.seniocaires.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
