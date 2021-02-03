package arrays;

import java.util.Arrays;

public class Exercício2 {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7; 
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for(double notA: notasAlunoA) {
			totalAlunoA += notA;
		}
		
		// System.out.println("media A " + totalAlunoA / notasAlunoA.length); // versão sem formatação e arredondamento
		double mediaA = totalAlunoA / notasAlunoA.length;
		System.out.printf("Média aluno A: %.2f %n", mediaA);
		
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		notasAlunoB[0] = 2;
		notasAlunoB[1] = 1;
		System.out.println("Notas aluno B: " + Arrays.toString(notasAlunoB));
		
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println("Média aluno B: " + totalAlunoB / notasAlunoB.length);
		
		System.out.println(notasAlunoB[notasAlunoB.length -4]);
		System.out.println(notasAlunoB[3]);
	}
}
