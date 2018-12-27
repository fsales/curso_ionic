package com.fsales.demo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TB_ESTADO")
public class Estado implements Serializable {
    private static final long serialVersionUID = -4758950596714024312L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades = new ArrayList<>();

    public Estado() {

    }

    public Estado(String nome) {
        this.nome = nome;
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

    public List<Cidade> getCidades() {
        return cidades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estado)) return false;
        Estado estado = (Estado) o;
        return Objects.equals(getId(), estado.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Estado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cidades=" + cidades +
                '}';
    }
}
