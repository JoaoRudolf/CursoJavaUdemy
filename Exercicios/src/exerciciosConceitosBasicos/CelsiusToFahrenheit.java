package exerciciosConceitosBasicos;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		
		double celsius = 100;
		double fahrenheitDivisor = 9.0 / 5;
		double fahrenheitMultiplicador = fahrenheitDivisor * celsius;
		double fahrenheit = fahrenheitMultiplicador + 32;
		
		System.out.println("A temperatura de " + celsius + " graus Celsius, convertida para Fahrenheit é " + fahrenheit + " graus.");


		
		
		
		
	}
}
