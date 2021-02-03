package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		int c = a + b;
		
		//c = c + b;
		c += b;
		System.out.println(c);
		c-= a;
		System.out.println(c);
		c *= b;
		System.out.println(c);
		c /= 3;
		System.out.println(c);
		c %= 5;
		System.out.println(c);
	}

}
