package exerciciosConceitosBasicos;

public class Bhaskara {

	public static void main(String[] args) {
	
		double a = 1.0;
		double b = 12.0;
		double c = -13.0;
		
		double bAoQuadrado = b * b;
		double x4xaxc = 4 * a * c;
		double delta = bAoQuadrado - x4xaxc;
		
		System.out.println("O Delta é " + delta);
		
		double dividendo1 = - b + delta;
		double dividendo2 = - b - delta;
		double divisor = 2 * a;
		
		double resultado1 = dividendo1 / divisor;
		double resultado2 = dividendo2 / divisor;
		
		System.out.println("O resultado é " + resultado1 + " e " + resultado2 + ";");
		
		
	}
}
