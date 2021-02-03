package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		Predicate<Produto> isCaro = prod -> (prod.preco) * (1.0 - prod.desconto) >= 30.0;
		
		Produto camisa = new Produto("Camisa", 40.0, 0.30);
		System.out.println(isCaro.test(camisa));
	}

}
