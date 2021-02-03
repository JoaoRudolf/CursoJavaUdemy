package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio2 {
	
	public static void main(String[] args) {
		// 1 quantos alunos tem na turma?
		// 2 quantas notas cada aluno tem?
		// um array no outro
		// array externo = qtde de aluos
		// cada array interno representa a qtdade nota dos alunos
		// calcular média da turma inteira
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos tem na turma? ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas cada aluno tem? ");
		int qtdNotas = entrada.nextInt();
		
		double[][] turma = new double[qtdAlunos][qtdNotas];
		
		double soma = 0;
		for (int a = 0; a < turma.length; a++) {
			for (int n = 0; n < turma[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d.", n + 1, a + 1);
				turma[a][n] = entrada.nextDouble();
				soma += turma[a][n];
			}
			
		}
		
		System.out.println("A soma das notas é: " + soma);
		int qtdTotalNotas = qtdAlunos * qtdNotas;
		double media = soma / qtdTotalNotas;
		System.out.println("A media da turma é: " + media);
		System.out.println(Arrays.deepToString(turma));
		
		entrada.close();
	}

}
