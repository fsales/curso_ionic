package com.fsales.demo.domain;

import com.fsales.demo.domain.enums.EstadoPagamento;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TB_PAGAMENTO_BOLETO")
public class PagamentoComBoleto extends Pagamento implements Serializable {

    private static final long serialVersionUID = 5886271349366128838L;
    private Date dataVencimento;

    private Date dataPagamento;


    public  PagamentoComBoleto (){

    }

    public PagamentoComBoleto(EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
        super(estado, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public PagamentoComBoleto(EstadoPagamento estado, Pedido pedido, Date dataVencimento) {
        super(estado, pedido);
        this.dataVencimento = dataVencimento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
