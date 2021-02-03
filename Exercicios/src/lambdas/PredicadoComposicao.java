package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		Predicate<Integer> isPar = valor -> valor % 2 == 0;
		Predicate<Integer> isTresDigitos = valor -> valor >= 100 && valor <=999;
		
		System.out.println(isPar.and(isTresDigitos).negate().test(12));
		System.out.println(isPar.and(isTresDigitos).test(123));
		System.out.println(isPar.or(isTresDigitos).negate().test(523));
		System.out.println(isPar.or(isTresDigitos).test(523));
			
	}
}
