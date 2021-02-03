package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
	
	private String nomeDoAtributo;

	public NumeroForaIntervaloException(String nomeDoAtrubuto) {
		this.nomeDoAtributo = nomeDoAtrubuto;
	}
	
	
	@Override
	public String getMessage() {
		
		return String.format("O atributo %s está fora do intervalo", nomeDoAtributo);
	}
}
