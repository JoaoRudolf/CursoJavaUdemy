package arrays;

import java.util.Scanner;

public class Desafio {

	// quantas notas quer informar?
	// dois laços for
	// 1º armazenar as notas no array (tradicional) digite a nota 1, 2, 3...
	// depois de armazenar, percorrer novamente o array, usando forEach, somando na
	// variável soma
	// apresentar a média

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o número de notas: ");
		int numeroNotas = entrada.nextInt();
		System.out.println(numeroNotas);

		// double[] notas = new double[numeroNotas];

		double soma = 0;
		for (int i = 0; i < numeroNotas; i++) {
			System.out.println("Digite a nota: ");
			double nota = entrada.nextDouble();
			if (nota <= 10 && nota >= 0) {
				soma += nota;
			} else {
				System.out.println("Nota inválida.");
				break;
			}
		}

		System.out.println("soma: " + soma);

		double media = soma / numeroNotas;
		System.out.println("Média: " + media);

		entrada.close();
	}

}
