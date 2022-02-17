package infra;

import modelo.basico.Produto;

public class ProdutoDao extends DAO<Produto> {

	public ProdutoDao() {
		super(Produto.class);
	}
}
