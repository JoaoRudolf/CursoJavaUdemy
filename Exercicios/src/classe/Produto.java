package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double PrecoInicial) {
		nome = nomeInicial;
		preco = PrecoInicial;
	}
	
	public Produto() {
	}
	
	
	double precoComDesconto() {
		return preco * (1-desconto);
	}
		
}
