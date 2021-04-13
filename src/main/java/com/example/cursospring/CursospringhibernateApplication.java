package com.example.cursospring;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.cursospring.domain.Categoria;
import com.example.cursospring.domain.Cidade;
import com.example.cursospring.domain.Estado;
import com.example.cursospring.domain.Produtos;
import com.example.cursospring.repositories.CategoriaRepository;
import com.example.cursospring.repositories.CidadeRepository;
import com.example.cursospring.repositories.EstadoRepository;
import com.example.cursospring.repositories.ProdutoRepository;

@SpringBootApplication
public class CursospringhibernateApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursospringhibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Sala");
		Categoria cat3 = new Categoria(null,"Cozinha");
	
		Produtos p1 = new Produtos(null,"Computador",2000.00);
		Produtos p2 = new Produtos(null,"Mesa",5000.00);
		Produtos p3 = new Produtos(null,"Mouse",20.00);
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		Estado bahia = new Estado(null,"Bahia");
		Cidade cidade = new Cidade(null,"Camaçari",bahia);
		bahia.getCidades().addAll(Arrays.asList(cidade));
		
		cidadeRepository.saveAll(Arrays.asList(cidade));
		estadoRepository.saveAll(Arrays.asList(bahia));
		
		
		
	}

}
