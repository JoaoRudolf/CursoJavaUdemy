package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "roxa";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Yodan");
			break;
		default:
			System.out.println("Não sei nada");
			
		}
		
		System.out.println("Fim");
		
		int idade = 3;
		switch (idade) {
		case 3:
			System.out.println("sabe programar");
		case 2:
			System.out.println("sabe falar");
		case 1:
			System.out.println("sabe andar");
		case 0:
			System.out.println("sabe respirar");
				 
		}
		
	}

}
