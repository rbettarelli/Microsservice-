package com.ricardo.coursemc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ricardo.coursemc.domain.Categoria;
import com.ricardo.coursemc.domain.Cidade;
import com.ricardo.coursemc.domain.Cliente;
import com.ricardo.coursemc.domain.Endereco;
import com.ricardo.coursemc.domain.Estado;
import com.ricardo.coursemc.domain.Produto;
import com.ricardo.coursemc.domain.enums.TipoCliente;
import com.ricardo.coursemc.repositories.CategoriaRepository;
import com.ricardo.coursemc.repositories.CidadeRepository;
import com.ricardo.coursemc.repositories.ClienteRespository;
import com.ricardo.coursemc.repositories.EnderecoRespository;
import com.ricardo.coursemc.repositories.EstadoRepository;
import com.ricardo.coursemc.repositories.ProdutoRepository;

@SpringBootApplication
public class CouserMcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private ClienteRespository clienteRespository;
	
	@Autowired
	private EnderecoRespository enderecoRespository;
	
	public static void main(String[] args) {
		SpringApplication.run(CouserMcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");

		Cidade c1 = new Cidade(null, "Ubelandia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);

		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "12345678911", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("26416069", "26829136"));
		
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 301", "Jardim", "38220834", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "3877012", cli1, c2);
		
		
		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		
		clienteRespository.saveAll(Arrays.asList(cli1));
		enderecoRespository.saveAll(Arrays.asList(e1, e2));
		
		
	}

}
