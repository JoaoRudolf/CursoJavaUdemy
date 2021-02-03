package operadores;

public class DesafioLógicos {

	public static void main(String[] args) {
		// trabalho na terça (V ou F)
		// trabalho na quinta (V ou F)
		
		// se os 2 derem certo, compra uma tv de 50'
		// se 1 der certo, compra tv de 32'
		// comprando alguma tv, tomam sorvete juntos no shopping
		// nada deu certo, fica todo mundo em casa
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = false;
		
		boolean compra50 = trabalhoTerca && trabalhoQuinta;
		boolean compra32 = trabalhoTerca ^ trabalhoQuinta;
		boolean sorvete = trabalhoTerca || trabalhoQuinta;
		boolean ficaEmCasa = !sorvete;
		
		System.out.println("Compra TV de 50' " + compra50);
		System.out.println("Compra TV de 32' " + compra32);
		System.out.println("Toma sorvete no Shopping " + sorvete);
		System.out.println("Fica em casa " + ficaEmCasa);
		
	}
}
