package fundamentos;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {
		
		
		String salario01 = JOptionPane.showInputDialog("Digite o valor do salário de janeiro de 2020");
		String salario02 = JOptionPane.showInputDialog("Digite o valor do salário de fevereiro de 2020");
		String salario03 = JOptionPane.showInputDialog("Digite o valor do salário de março de 2020");
		
		double janeiro = Double.parseDouble(salario01);
		double fevereiro = Double.parseDouble(salario02);
		double março = Double.parseDouble(salario03);
		
		double soma = janeiro + fevereiro + março;
		
		System.out.println("A média salarial do primeiro trimestre de 2020 é de R$ " + soma / 3);
	
	}
}
