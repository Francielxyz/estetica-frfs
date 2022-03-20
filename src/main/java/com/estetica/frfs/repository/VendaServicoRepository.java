package com.estetica.frfs.repository;

import com.estetica.frfs.entity.VendaServico;
import com.estetica.frfs.entity.VendaServicoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaServicoRepository extends JpaRepository<VendaServico, VendaServicoPK> {
}
