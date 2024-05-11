package br.com.descomplica.documentacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.descomplica.documentacao.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

}
