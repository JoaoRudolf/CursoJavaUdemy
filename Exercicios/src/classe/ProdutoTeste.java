package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
		p1.preco = 4_000;
		
		Produto p2 = new Produto();
		p2.nome = "caneta preta";
		p2.preco = 12.56;
		
		Produto p3 = new Produto("manga", 2.50);
		
		//Produto.desconto = 0.1;
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());
		System.out.println(p3.nome + ": preço: R$ " + p3.preco + ", com desconto fica " + p3.precoComDesconto());
		
		double precoFinal = p1.precoComDesconto();
		System.out.printf("%.2f", precoFinal);
		

		
		
	}
}
