package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		Pedido pedido = new Pedido();
		Produto leite = new Produto("leite", 2.90);
		Produto cafe = new Produto("café", 12.50);
		Produto filtro = new Produto("filtro café", 3.84);
		ItemPedido itemPedido = new ItemPedido(pedido, leite, 12);
		ItemPedido itemPedido2 = new ItemPedido(pedido, cafe, 3);
		ItemPedido itemPedido3 = new ItemPedido(pedido, filtro, 2);
		
		dao
			.abrirTransacao()
			.incluir(leite)
			.incluir(cafe)
			.incluir(filtro)
			.incluir(pedido)
			.incluir(itemPedido)
			.incluir(itemPedido2)
			.incluir(itemPedido3)
			.fecharTransacao()
			.fechar();		
	}

}
