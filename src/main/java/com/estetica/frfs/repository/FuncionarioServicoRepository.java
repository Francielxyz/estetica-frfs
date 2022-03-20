package com.estetica.frfs.repository;

import com.estetica.frfs.entity.FuncionarioServico;
import com.estetica.frfs.entity.FuncionarioServicoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioServicoRepository extends JpaRepository<FuncionarioServico, FuncionarioServicoPK> {
}
