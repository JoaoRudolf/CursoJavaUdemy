package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		Filme filmeA = new Filme("Forrest Gump", 10.0);
		Filme filmeB = new Filme("O resgate do soldado Ryan", 9.6);
		
		Ator ator = new Ator("Tom Hanks");
		Ator atriz = new Ator("Jennie");
		
		filmeA.adicionarAtor(ator);
		filmeA.adicionarAtor(atriz);
		
		filmeB.adicionarAtor(ator);
		
		DAO<Filme> dao = new DAO<>();
		dao.incluirAtomico(filmeA);

	}

}
