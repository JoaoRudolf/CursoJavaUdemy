package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e add > adicionam elemento na fila
		// a diferença é o comportamento qdo a fila está cheia
		
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); //lança exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// diferença quando a lista está vazia
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek()); 
		System.out.println(fila.element()); // lança exceção
		System.out.println(fila.element());
		
		//fila.clear();
		//fila.isEmpty();
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
//		System.out.println(fila.contains("Bia"));


		
	}

}
