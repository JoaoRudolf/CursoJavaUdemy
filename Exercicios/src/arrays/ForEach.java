package arrays;

public class ForEach {

	public static void main(String[] args) {
		
		double[] notas = { 9.9, 8.7, 7.2, 9.4 };
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		System.out.println();
		
		for(double n: notas) {
			System.out.println(n);
		}
	}
}
