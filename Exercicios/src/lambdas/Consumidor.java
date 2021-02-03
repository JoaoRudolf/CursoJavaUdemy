package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");;
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimirNome.accept(p1);
		Produto p2 = new Produto("Notebook", 2112.34, 0.25);
		Produto p3 = new Produto("Caderno", 19.34, 0.18);
		Produto p4 = new Produto("Borracha", 7.34, 0.09);
		Produto p5 = new Produto("Lápis", 4.34, 0.08);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}
