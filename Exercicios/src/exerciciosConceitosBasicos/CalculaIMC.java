package exerciciosConceitosBasicos;

public class CalculaIMC {

	public static void main(String[] args) {
		
		// IMC = peso / altura * altura
		
		double peso = 85.0;
		double altura = 1.68; 
		
		double alturaAoQuadrado = altura * altura;
		double imc = peso / alturaAoQuadrado;
		
		System.out.println("O IMC calculado é de " + imc + ".");
	}
	
}

