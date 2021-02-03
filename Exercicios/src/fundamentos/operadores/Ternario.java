package fundamentos.operadores;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 8.6;
		String filtroAprovado = media >= 7.0 ? "Aprovado" : "Em recuperação";
		String resultado = media <=4 ? "Reprovado" : filtroAprovado;
		System.out.println(resultado);
		
		int a = 5;
		int b = 5;
		//boolean c = a==b; 
		System.out.println(a==b);
		Scanner entrada = new Scanner(System.in);
		
		
		String s = "oi ";
		String t = entrada.next();
		System.out.println(s + t);
		
		entrada.close();
	}
}

