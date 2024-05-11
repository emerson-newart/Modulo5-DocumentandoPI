package br.com.descomplica.documentacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.descomplica.documentacao.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Integer> {

}
