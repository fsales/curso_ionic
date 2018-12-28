package com.fsales.demo.domain;

import com.fsales.demo.domain.enums.EstadoPagamento;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TB_PAGAMENTO_CARTAO")
public class PagamentoComCartao extends Pagamento implements Serializable {

    private  Integer numeroParcelas;

    public PagamentoComCartao(){

    }

    public PagamentoComCartao(EstadoPagamento estado, Pedido pedido, Integer numeroParcelas) {
        super(estado, pedido);

        this.numeroParcelas = numeroParcelas;
    }

    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }
}
