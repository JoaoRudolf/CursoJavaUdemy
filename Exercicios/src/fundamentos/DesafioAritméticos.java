package fundamentos;

public class DesafioAritméticos {
	
	public static void main(String[] args) {
		
		int esqSupAdic = 3 + 2;	
		int esqSupMult = 6 * esqSupAdic;	
			int esqSup = (int) Math.pow(esqSupMult, 2);
			int esqInf = 3 * 2;
				int esquerda = esqSup / esqInf;		
		int dirSupSub1 = 1 - 5;
		int dirSupSub2 = 2 - 7;
		int dirSupMult = dirSupSub1 * dirSupSub2;
		int dirInf = 2;
			int dirPoten = dirSupMult / dirInf;
				int direita = (int) Math.pow( dirPoten, 2);
					int numeradorPoten = esquerda - direita;
						int numerador = (int) Math.pow(numeradorPoten, 3);
						int divisor = (int) Math.pow(10, 3);
						int total = numerador / divisor;
		
		System.out.println("O resultador é: " + total);
		
}
}
