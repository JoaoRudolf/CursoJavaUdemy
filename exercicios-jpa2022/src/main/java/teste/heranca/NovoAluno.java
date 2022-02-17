package teste.heranca;

import infra.DAO;
import modelo.heranca.AlunoBolsista;
import modelo.heranca.AlunoFeliz;

public class NovoAluno {

	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		AlunoBolsista alunoBol = new AlunoBolsista();
		AlunoFeliz alunoFel = new AlunoFeliz();
		alunoBol.setNome("trewste");
		alunoBol.setValorBolsa(500.00);
		
		alunoFel.setNome("felizao");
		alunoFel.setNivelFelicidade(800.0);
		
		dao
			.abrirTransacao()
			.incluir(alunoBol)
			.incluir(alunoFel)
			.fecharTransacao()
			.fechar();
	}

}
