package controle;

import java.util.Scanner;

public class Controle1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			System.out.println("Escreva um n�mero: ");
			double numero = entrada.nextDouble();
			
			if(numero >= 0 && numero <= 10) {
				System.out.println("O n�mero est� entre 0 e 10");
			} else System.out.println("O n�mero n�o est� entre 0 e 10");
			
			if(numero %2 == 0) {
				System.out.println("O n�mero � par");
			} else System.out.println("O n�mero � �mpar");
			
			
	
		entrada.close();
		
	}

}
