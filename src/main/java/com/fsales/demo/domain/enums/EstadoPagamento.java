package com.fsales.demo.domain.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum EstadoPagamento {
    PENDENTE(1, "Pendente"),
    QUITADO(2, "Quitado"),
    CANCELADO(3, "Cancelado"),
    ;


    private static final Map<Integer, EstadoPagamento> map = Arrays.stream(EstadoPagamento.values()).collect(Collectors.toMap(t -> t.getCodigo(), t -> t));

    private final int codigo;

    private final String descricao;

    private EstadoPagamento(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Stream<TipoCliente> stream() {
        return Stream.of(TipoCliente.values());
    }

    public static EstadoPagamento toEnum(Integer codigo) {
        return codigo == null ? null : map.get(codigo);
    }
}
