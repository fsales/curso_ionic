package com.fsales.demo.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fsales.demo.domain.enums.TipoCliente;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente implements Serializable {
    private static final long serialVersionUID = -3924294595039302362L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String cpfOrCnpj;

    private Integer tipoCliente;

    @JsonManagedReference
    @OneToMany(mappedBy = "cliente")
    private final List<Endereco> enderecos = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "TB_TELEFONE")
    private final Set<String> telefones = new HashSet<>();
    
    @OneToMany(mappedBy = "cliente")
    private final List<Pedido> pedidos = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nome, String email, String cpfOrCnpj, TipoCliente tipoCliente) {
        this.nome = nome;
        this.email = email;
        this.cpfOrCnpj = cpfOrCnpj;
        this.tipoCliente = tipoCliente == null ? null : tipoCliente.getCodigo();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfOrCnpj() {
        return cpfOrCnpj;
    }

    public void setCpfOrCnpj(String cpfOrCnpj) {
        this.cpfOrCnpj = cpfOrCnpj;
    }

    public TipoCliente getTipoCliente() {
        return TipoCliente.toEnum(tipoCliente);
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente == null ? null : tipoCliente.getCodigo();
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public Set<String> getTelefones() {
        return telefones;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(getId(), cliente.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpfOrCnpj='" + cpfOrCnpj + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", enderecos=" + enderecos +
                ", telefones=" + telefones +
                '}';
    }
}
