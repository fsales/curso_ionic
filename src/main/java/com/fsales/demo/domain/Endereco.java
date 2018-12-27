package com.fsales.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TB_ENDERECO")
public class Endereco implements Serializable {

    private  Long id;

    private  String logradouro;

    private  String numero;

    private  String complemento;

    private  String bairro;

    private String cep;

    private Cidade cidade;

    private Cliente cliente;
}
