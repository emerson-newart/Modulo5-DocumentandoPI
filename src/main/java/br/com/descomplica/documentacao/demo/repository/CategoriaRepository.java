package br.com.descomplica.documentacao.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.descomplica.documentacao.demo.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

}
