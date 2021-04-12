package com.example.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursospring.domain.Categoria;
import com.example.cursospring.domain.Produtos;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos, Integer> {

}
