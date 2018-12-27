package com.fsales.demo.domain.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private static final Map<Integer, TipoCliente> map = Arrays.stream(TipoCliente.values()).collect(Collectors.toMap(t -> t.getCodigo(), t -> t));

    private final int codigo;

    private final String descricao;

    private TipoCliente(int codigo, String descricao) {
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

    public static TipoCliente toEnum(Integer codigo) {
        return codigo == null ? null : map.get(codigo);
    }
}
