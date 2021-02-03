package fundamentos;

public class Temperatura2 {

	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC;
		double ajuste = -32;
		double multiplicador = 5.0/9.0;
		double ºF = 15;
		double ºC = (ºF + ajuste) * multiplicador;
			System.out.println(ºC);
	}
	
}
