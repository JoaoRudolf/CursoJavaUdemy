package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {
	
	public static void main(String[] args) {
		Consumer<String> println = System.out::println;
		
		Acao tiet = new Acao("AES TIETE", 2001, false, 2003);
		Acao aflt = new Acao("AFLUENTE", 2010, false, 2010);
		Acao arzz = new Acao("AREZZO", 2011, true, 2008);
		Acao azul = new Acao("AZUL", 2017, false, 2021);
		Acao bbdc = new Acao("BRADESCO", 1977, true, 1995);
		
		List<Acao> acoes = Arrays.asList(tiet, aflt, arzz, azul, bbdc);
		
		Predicate<Acao> ipoRecente = a -> (2020 - a.anoIpo) >= 10;
		Predicate<Acao> novoMercado = a -> a.novoMercado;
		Predicate<Acao> lucroConsistente = a -> (2020 - a.anosLucro) >= 10;
		Function<Acao, String> AcaoParaString = a -> a.nome + "";
		
		acoes.stream()
		.filter(ipoRecente)
		.filter(novoMercado)
		.filter(lucroConsistente)
		.map(AcaoParaString)
		.forEach(println);
	}

}
