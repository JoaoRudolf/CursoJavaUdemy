package operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		int d = 6;
		
		c += b; // c = c + b;
		System.out.println(c);
		
		c -= a; // c = c - a
		System.out.println(c);
		
		//c *= b; // c = c * b
		//System.out.println(c);
		
		c /= a; // c = c / a
		System.out.println(c);
		
		
		int e = d++;
		System.out.println(e);
		
	}
}
