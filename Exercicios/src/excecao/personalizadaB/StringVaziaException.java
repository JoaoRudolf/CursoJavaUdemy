package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
	
	private String nomeDoAtributo;

	public StringVaziaException(String nomeDoAtrubuto) {
		this.nomeDoAtributo = nomeDoAtrubuto;
	}
	
	
	@Override
	public String getMessage() {
		
		return String.format("O atributo %s está vazio", nomeDoAtributo);
	}
}
