package com.estetica.frfs.repository;

import com.estetica.frfs.entity.AgendarServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendarServicoRepository extends JpaRepository<AgendarServico, Long> {
}
