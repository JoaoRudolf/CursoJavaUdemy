package controle;

import java.util.Scanner;

public class Controle3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			System.out.println("Digite a primeira nota");
		double nota1 = entrada.nextDouble();
			System.out.println("Digite a segunda nota");
		double nota2 = entrada.nextDouble();
		double soma = nota1 + nota2;
		double media = soma / 2;	
		
		if (media >= 7 && media <= 10) {
			System.out.println("Aprovado");
		}
		else if (media <7 && media >= 4)	{
			System.out.println("Em recuperação");			
		}
		else if (media <4 && media >=0) {
			System.out.println("Reprovado");
		}
		else System.out.println("Número inválido");

		
		System.out.println();
		
		entrada.close();
		
		
;
		}
}
