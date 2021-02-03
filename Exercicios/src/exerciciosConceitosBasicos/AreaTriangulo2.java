package exerciciosConceitosBasicos;

import java.util.Scanner;

public class AreaTriangulo2 {
	
	public static void main(String[] args) {
		

	Scanner scanner = new Scanner(System.in);
    
	System.out.println("Digite a Base:");
	double base = scanner.nextDouble();
	
	System.out.println("Digite a Altura:");
	double altura = scanner.nextDouble();
	
	double area = (base * altura) / 2;
	
	System.out.print("A Área do Triângulo é: " + area);
	
	scanner.close();
	}
}

