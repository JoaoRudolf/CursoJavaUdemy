package operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	
		public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operação: ");
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
				("Digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog
				("Digite o segundo número");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + soma / 2);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 		double media = 8.99;
		String resultadoEmRecuperacao = media >= 5.0 ? "em recuperação" : "reprovado" ;
		String resultado = media >= 7.0 ? "aprovado" : resultadoEmRecuperacao ;
		
		System.out.println("O aluno está " + resultado);
		
		
		
			public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog
				("Digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog
				("Digite o segundo número");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + soma / 2);
	}
		
		 */
	}
}

