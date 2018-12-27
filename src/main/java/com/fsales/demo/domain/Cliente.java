package com.fsales.demo.domain;

import com.fsales.demo.domain.enums.TipoCliente;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente implements Serializable {
    private static final long serialVersionUID = -3924294595039302362L;

    private  Long id;

    private  String nome;

    private  String email;

    private String cpfOrCNPJ;

    private TipoCliente tipoCliente;
}
