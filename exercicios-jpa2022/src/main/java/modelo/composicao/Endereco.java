package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String logradouroString;
	private String complementoString;
	
	
	public String getLogradouroString() {
		return logradouroString;
	}
	public void setLogradouroString(String logradouroString) {
		this.logradouroString = logradouroString;
	}
	public String getComplementoString() {
		return complementoString;
	}
	public void setComplementoString(String complementoString) {
		this.complementoString = complementoString;
	}
	
	
}