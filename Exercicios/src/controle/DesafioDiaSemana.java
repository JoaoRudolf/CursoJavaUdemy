package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

		public static void main(String[] args) {
						
			Scanner entrada = new Scanner(System.in);
			System.out.print("Digite o dia da semana (Ex:sabado, domingo, segunda, etc): ");
			
			String dia = entrada.next();
			
			if((dia.equalsIgnoreCase("domingo")) || (dia.equalsIgnoreCase("domingão")) ) {
			System.out.println("1");
			}
			else if(dia.equalsIgnoreCase("Segunda") || (dia.equalsIgnoreCase("Segunda-feira"))) {
			System.out.println("2");
		    }
			else if(dia.equalsIgnoreCase("Terça")) {
			System.out.println("3");
		    }
			else if(dia.equalsIgnoreCase("Quarta")) {
			System.out.println("4");
		    }
			
			else {
				System.out.println("dia inválido");
			}
			
		
			entrada.close();
			
		}
}
