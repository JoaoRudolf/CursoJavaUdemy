package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.8, 5.7));
		
		BiFunction<Double, Double, String> resultado =
				(n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Não Aprovado";
		System.out.println(resultado.apply(9.8, 3.7));		
	}

}
