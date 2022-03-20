package com.estetica.frfs.repository;

import com.estetica.frfs.entity.VendaPagamento;
import com.estetica.frfs.entity.VendaPagamentoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaPagamentoRepository extends JpaRepository<VendaPagamento, VendaPagamentoPK> {
}
