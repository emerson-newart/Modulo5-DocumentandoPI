package br.com.descomplica.documentacao.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.descomplica.documentacao.demo.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Integer> {

}
