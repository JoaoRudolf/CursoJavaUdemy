package operadores;

import java.util.Scanner;

class StringEquals {

	public static void main(String[] args) {
		String s1 = new String ("2");
		System.out.println("2".contentEquals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
