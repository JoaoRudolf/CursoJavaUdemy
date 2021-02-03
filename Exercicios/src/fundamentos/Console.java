package fundamentos;

import java.util.Scanner;

public class Console {

	
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia\n\n\n\n");
		
		System.out.println("Bom");
		
		System.out.printf("Mega Sena: %d %d %d %d %d %d \n",
				13, 05, 42, 9, 55, 59);
		System.out.printf("Salário: %.2f \n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos", nome, sobrenome, idade);
		
		entrada.close();
		
	}
}
