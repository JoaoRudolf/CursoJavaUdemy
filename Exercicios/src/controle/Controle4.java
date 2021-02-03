package controle;

import java.util.Scanner;

public class Controle4 {
	
	public static void main(String[] args) {
		
		
		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva um número e pressione \"enter\" para saber se ele é primo ");
		double numero = entrada.nextDouble();
		
		for(double i = 2; i < numero; i++) {
			
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		if (contadorDeDivisores == 0) {
			System.out.println("\nO número " + numero + " é primo.");
		} else {
			System.out.println("\nO número " + numero + " não é primo");
		}
		
		
		entrada.close();
		
	}
	

}
