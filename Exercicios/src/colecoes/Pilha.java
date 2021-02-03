package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Príncipe");
		livros.push("Dom Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.contains("O hobbit"));

		
	}

}
