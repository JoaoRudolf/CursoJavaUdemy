package classe;

import java.util.Date;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 24;
		d1.mes = 11;
		d1.ano = 1988;
		
		Data d2 = new Data();
		
		Date d3 = new Date();
		
		System.out.println(d1.obterDataFormatada());
		System.out.printf("%d/%d/%d %n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
		System.out.println(d3);
		
		Data d4 = new Data();
		String s = d4.obterDataFormatada();
		System.out.println(s);
		
		Data d5 = new Data();
		System.out.println(d5.obterDataFormatada());
		
		Data d6 = new Data(25, 10, 2020, 12);
		System.out.println(d6.obterDataFormatada());
		System.out.println();
		
		Data d7 = new Data(20, 10, 2020, 12);
		Data d8 = new Data();
		
		System.out.println(d7.obterDataFormatada() + "  " + d8.obterDataFormatada());
		d8 = d7;
		System.out.println(d7.obterDataFormatada() + "  " + d8.obterDataFormatada());
		d8.dia = 21;
		System.out.println(d7.obterDataFormatada() + "  " + d8.obterDataFormatada());
		
		
	}

}
