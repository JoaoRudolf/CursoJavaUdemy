package modelo.heranca;

import javax.persistence.Entity;

@Entity
public class AlunoFeliz extends Aluno {

	private Double nivelFelicidade;
	
	public AlunoFeliz() {
		// TODO Auto-generated constructor stub
	}

	public AlunoFeliz(Long matricula, String nome, Double nivelFelicidade) {
		super(matricula, nome);
		this.nivelFelicidade = nivelFelicidade;
	}

	public Double getNivelFelicidade() {
		return nivelFelicidade;
	}

	public void setNivelFelicidade(Double nivelFelicidade) {
		this.nivelFelicidade = nivelFelicidade;
	}

	

	
	
	
	
}
