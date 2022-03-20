package com.estetica.frfs.repository;

import com.estetica.frfs.entity.VendaProduto;
import com.estetica.frfs.entity.VendaProdutoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaProdutoRepository extends JpaRepository<VendaProduto, VendaProdutoPK> {
}
