package br.com.descomplica.documentacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.descomplica.documentacao.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

}
