package operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 8.99;
		String resultadoEmRecuperacao = media >= 5.0 ? "em recuperação" : "reprovado" ;
		String resultado = media >= 7.0 ? "aprovado" : resultadoEmRecuperacao ;
		
		System.out.println("O aluno está " + resultado);
		
	}
}
