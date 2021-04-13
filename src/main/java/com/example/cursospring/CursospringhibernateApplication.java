package com.example.cursospring;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.cursospring.domain.Categoria;
import com.example.cursospring.domain.Cidade;
import com.example.cursospring.domain.Cliente;
import com.example.cursospring.domain.Endereco;
import com.example.cursospring.domain.Estado;
import com.example.cursospring.domain.Produtos;
import com.example.cursospring.domain.enums.TipoCliente;
import com.example.cursospring.repositories.CategoriaRepository;
import com.example.cursospring.repositories.CidadeRepository;
import com.example.cursospring.repositories.ClienteRepository;
import com.example.cursospring.repositories.EnderecoRepository;
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
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ClienteRepository clienteRepository;

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
		
		Estado bahia = new Estado(null,"Bahia");
		Cidade cidade = new Cidade(null,"Camaçari",bahia);
		bahia.getCidades().addAll(Arrays.asList(cidade));
		
		Cliente cliente1 = new Cliente(null,"Kelly Carvalho","18kellycarvalho@gmail.com","07973767550",TipoCliente.PESSOAFISICA);
		 cliente1.getTelefones().addAll(Arrays.asList("71987498456"));
		 Endereco endereco = new Endereco(null, "Rua delmiro golveia", "300", "casa", "Jardim", "4256978", cliente1, cidade);
		 cliente1.getEnderecos().addAll(Arrays.asList(endereco));
		 categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
			produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		cidadeRepository.saveAll(Arrays.asList(cidade));
		estadoRepository.saveAll(Arrays.asList(bahia));
		clienteRepository.saveAll(Arrays.asList(cliente1));
		enderecoRepository.saveAll(Arrays.asList(endereco));
		
		
		
	}

}
