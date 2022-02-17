package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {

	public static void main(String[] args) {
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterPorId(9L);
		
		for(ItemPedido item: pedido.getItens()) {
			System.out.println(item.getProduto().getNome() + " > qtd: " + item.getQtd() + " preço: " + item.getPreco() + " total: " + (item.getQtd()*item.getPreco()));
		}
		
		dao.fechar();
	}

}
