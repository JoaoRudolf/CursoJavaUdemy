package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e add > adicionam elemento na fila
		// a diferen�a � o comportamento qdo a fila est� cheia
		
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); //lan�a exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// diferen�a quando a lista est� vazia
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek()); 
		System.out.println(fila.element()); // lan�a exce��o
		System.out.println(fila.element());
		
		//fila.clear();
		//fila.isEmpty();
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
//		System.out.println(fila.contains("Bia"));


		
	}

}
