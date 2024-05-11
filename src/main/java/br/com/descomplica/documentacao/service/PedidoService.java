package br.com.descomplica.documentacao.service;

import java.util.List;

import br.com.descomplica.documentacao.entity.Pedido;
import br.com.descomplica.documentacao.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
	@Autowired
    PedidoRepository pedidoRepository;
	
	public List<Pedido> getAll(){
		return pedidoRepository.findAll();
	}
	
	public Pedido getById(Integer id) {
		return pedidoRepository.findById(id).orElse(null) ;
	}
	
	public Pedido savePedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public Pedido updatePedido(Integer id, Pedido pedido) {
		Pedido pedidoAtualizado = pedidoRepository.findById(id).orElse(null);
		if(pedidoAtualizado != null) {
			pedidoAtualizado.setPedidoData(pedido.getPedidoData());
			return pedidoRepository.save(pedidoAtualizado);
		}else {
			return null;
		}
	}

	public Boolean deletePedido(Integer id) {
		Pedido pedido = pedidoRepository.findById(id).orElse(null);
		if(pedido != null) {
			pedidoRepository.delete(pedido);
			return true;
		}else {
			return false;
		}
	}
}
