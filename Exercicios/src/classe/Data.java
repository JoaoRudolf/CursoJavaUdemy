package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	int fase;
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d e fase %d", dia, mes, ano, fase);
	}
	
	public Data() {
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(07, 05, 2015, 2);
	}
	
	public Data(int diaD, int mesM, int anoA, int fase) {
		this.dia = diaD;
		this.mes = mesM;
		this.ano = anoA;
		this.fase = fase;
	}
}
