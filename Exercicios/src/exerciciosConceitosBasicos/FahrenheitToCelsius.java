package exerciciosConceitosBasicos;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		

		double fahrenheit = 13;
		double subtracao = fahrenheit - 32.0;
		double divisao = 5.0 / 9.0;
		double celsius = subtracao * divisao;
		
		System.out.println("A temperatura de " + fahrenheit + " graus Frahrenheit convertida para Celsius é de " + celsius + " graus.");
		

	}
	
}

