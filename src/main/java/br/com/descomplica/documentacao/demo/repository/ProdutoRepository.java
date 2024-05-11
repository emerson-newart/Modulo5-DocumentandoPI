package br.com.descomplica.documentacao.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.descomplica.documentacao.demo.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

}
