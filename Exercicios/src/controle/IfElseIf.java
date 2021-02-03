package controle;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota inválida!");
			
			} else if(nota <= 10 && nota >=8) {
			System.out.println("Conceito A");	
			
			} else if(nota < 9 && nota >= 6) {
			System.out.println("Conceito B");	
			
			} else if(nota < 6 && nota >= 4) {
			System.out.println("Conceito C");
			
			} else if(nota < 4 && nota >= 0) {
			System.out.println("Conceito D");
		}
 		
		
		
		entrada.close();
	}

}
