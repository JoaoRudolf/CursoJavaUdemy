package fundamentos;

import java.util.Scanner;

public class DesafioConversao2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o salário de janeiro: ");
		String valor1 = entrada.next().replace(",", ".");
				
		System.out.print("\nInforme o salário de fevereiro: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("\nInforme o salário de março: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = salario1 + salario2 + salario3; 
		double media = soma / 3;
				
		System.out.println("\nA média salarial do primeiro trimestre de 2020 foi de R$ " + media);		
		
		
		entrada.close();
	}
}
