package com.example.almoxarifado_api;

import com.example.almoxarifado_api.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}