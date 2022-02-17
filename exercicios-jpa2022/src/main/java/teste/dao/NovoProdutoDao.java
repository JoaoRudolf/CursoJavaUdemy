package teste.dao;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProdutoDao {

	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		Produto produto = new Produto("camisa", 50.00);
		dao.incluirAtomico(produto);
		
	}
}
