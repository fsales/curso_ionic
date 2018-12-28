package com.fsales.demo.repositories;

import com.fsales.demo.domain.Pagamento;
import com.fsales.demo.domain.PagamentoComBoleto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
