package fundamentos;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {
		
		
		String salario01 = JOptionPane.showInputDialog("Digite o valor do sal�rio de janeiro de 2020");
		String salario02 = JOptionPane.showInputDialog("Digite o valor do sal�rio de fevereiro de 2020");
		String salario03 = JOptionPane.showInputDialog("Digite o valor do sal�rio de mar�o de 2020");
		
		double janeiro = Double.parseDouble(salario01);
		double fevereiro = Double.parseDouble(salario02);
		double mar�o = Double.parseDouble(salario03);
		
		double soma = janeiro + fevereiro + mar�o;
		
		System.out.println("A m�dia salarial do primeiro trimestre de 2020 � de R$ " + soma / 3);
	
	}
}
