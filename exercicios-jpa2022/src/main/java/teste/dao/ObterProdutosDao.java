package teste.dao;

import java.util.List;

import infra.ProdutoDao;
import modelo.basico.Produto;

public class ObterProdutosDao {

	public static void main(String[] args) {
		
		ProdutoDao dao = new ProdutoDao();
		List<Produto> produtos = dao.obterTodos();
		
		for (Produto produto : produtos) {
			System.out.println("produto " + (produtos.indexOf(produto)+1) + "º " + produto.getNome());
		}
		
		double precoTotal = produtos
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t,p) -> t + p)
				.doubleValue();
		System.out.println("valor total " + precoTotal);
		
	}
	



}
