package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá, Enfermeira!".charAt(3));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		
		String nome = "João";
		String sobrenome = "Rudolf";
		int idade = 32;
		double salario = 4610.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %s.", 
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %s anos e ganha R$ %s.", 
				nome, sobrenome, idade, salario);
		
		System.out.println(frase);
	
		System.out.println("Frase qualquer".contains("frase"));
		System.out.println("Frase qualquer".indexOf("Frase"));
		System.out.println("Frase qualquer".substring(4, 7));
		System.out.println("Frase qualquer".codePointBefore(3));
		
				
		
	}

}