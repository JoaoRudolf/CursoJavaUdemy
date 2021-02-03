package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
//		 informações do funcionário
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56452;
		long pontosAcumulados = 2_451_968_745L;
		
// tipos numéricos reais
		float salario = 11_845.44F;
		double vendasAcumuladas = 3_656_747_111.03;
		
//		tipo booleano
		boolean estaDeFerias = false;
		char status = 'A';
		
//		dias de empresa
		System.out.println("anos de empresa: " + anosDeEmpresa * 365 + " anos");
		
//		numero de viagens
		System.out.println(numeroDeVoos / 2);
		
//		pontos acumulados
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " :ganha > " + salario);
		
		System.out.println("férias?" + estaDeFerias);
		
		System.out.println("status: " + status);
	}
	
}
