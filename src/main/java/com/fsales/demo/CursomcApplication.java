package com.fsales.demo;

import com.fsales.demo.domain.*;
import com.fsales.demo.domain.enums.TipoCliente;
import com.fsales.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

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
    private  ClienteRepository clienteRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Categoria cat1 = new Categoria("Informática");
        Categoria cat2 = new Categoria("Escritório");

        Produto p1 = new Produto("Computador", 2000D);
        Produto p2 = new Produto("Impressoar", 400D);
        Produto p3 = new Produto("Mouser", 50D);

        cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
        cat2.getProdutos().addAll(Arrays.asList(p2));

        p1.getCategorias().add(cat1);
        p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
        p3.getCategorias().add(cat1);

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
        produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

        Estado est1 = new Estado("Minas Gerais", "MG");
        Estado est2 = new Estado("São Paulo", "SP");

        Cidade c1 = new Cidade("Uberlândia", est1);
        Cidade c2 = new Cidade("São Paulo", est2);
        Cidade c3 = new Cidade("Campinas", est2);

        est1.getCidades().add(c1);
        est2.getCidades().addAll(Arrays.asList(c2, c3));

        estadoRepository.saveAll(Arrays.asList(est1, est2));
        cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));

        Cliente cli1 = new Cliente("Maria", "maria@gmail.com", "5855", TipoCliente.PESSOA_FISICA);
        cli1.getTelefones().addAll(Arrays.asList("61333-3656","61333-3856"));

        Endereco end1 = new Endereco("qc", "3","casa","teste","99999-099", c1, cli1);
        Endereco end2 = new Endereco("qc", "3","casa","teste","99999-099", c2, cli1);
        cli1.getEnderecos().addAll(Arrays.asList(end1, end2));



        Cliente cli2 = new Cliente("Home Center Casa", "homecasa@gmail.com", "5855889", TipoCliente.PESSOA_JURIDICA);
        cli2.getTelefones().addAll(Arrays.asList("61333-3656","61333-3756"));

        Endereco end3 = new Endereco("qc", "3","casa","teste","99999-099", c3, cli2);
        cli2.getEnderecos().addAll(Arrays.asList(end3));

        clienteRepository.saveAll(Arrays.asList(cli1, cli2));

        enderecoRepository.saveAll(Arrays.asList(end1, end2, end3));
    }
}

