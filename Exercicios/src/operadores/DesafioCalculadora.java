package operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	
		public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o n�mero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o n�mero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a opera��o: ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		entrada.close();
		
		// ler numero 1
		// ler numero 2
		// operacao + - * / %
		
		/*
		 * import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog
				("Digite o primeiro n�mero");
		String valor2 = JOptionPane.showInputDialog
				("Digite o segundo n�mero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("A soma �: " + soma);
		System.out.println("A m�dia �: " + soma / 2);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 		double media = 8.99;
		String resultadoEmRecuperacao = media >= 5.0 ? "em recupera��o" : "reprovado" ;
		String resultado = media >= 7.0 ? "aprovado" : resultadoEmRecuperacao ;
		
		System.out.println("O aluno est� " + resultado);
		
		
		
			public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog
				("Digite o primeiro n�mero");
		String valor2 = JOptionPane.showInputDialog
				("Digite o segundo n�mero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("A soma �: " + soma);
		System.out.println("A m�dia �: " + soma / 2);
	}
		
		 */
	}
}

