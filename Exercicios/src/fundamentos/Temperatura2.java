package fundamentos;

public class Temperatura2 {

	public static void main(String[] args) {
		// (�F - 32) x 5/9 = �C;
		double ajuste = -32;
		double multiplicador = 5.0/9.0;
		double �F = 15;
		double �C = (�F + ajuste) * multiplicador;
			System.out.println(�C);
	}
	
}
