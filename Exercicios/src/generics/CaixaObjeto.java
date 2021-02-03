package generics;

public class CaixaObjeto {
	
	private Object nessinha;
	
	public void guardar(Object coisa) {
		this.nessinha = coisa;
	}

	public Object abrir() {
		return nessinha;
	}
	
	
}
