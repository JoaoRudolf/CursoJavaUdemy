package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Nessa", 10.0);
		Aluno a3 = new Aluno("Joãozin", 6.9);
		Aluno a4 = new Aluno("Magali", 2.0);
		Aluno a5 = new Aluno("Gustavin", 8.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		
		System.out.println(alunos.parallelStream().max(melhorNota).get());
		System.out.println(alunos.parallelStream().min(melhorNota).get());
	}
}
