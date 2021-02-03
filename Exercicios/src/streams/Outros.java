package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Nessa", 10.0);
		Aluno a3 = new Aluno("Joãozin", 6.9);
		Aluno a4 = new Aluno("Lu", 5.0);
		Aluno a5 = new Aluno("Gustavin", 8.8);
		Aluno a6 = new Aluno("Joãozin", 6.9);
		Aluno a7 = new Aluno("Lu", 5.0);
		Aluno a8 = new Aluno("Gustavin", 8.8);
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distinct...");
		alunos.parallelStream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
			.distinct()
			//.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);
	}

}
