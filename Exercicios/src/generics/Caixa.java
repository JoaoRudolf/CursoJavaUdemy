package generics;

public class Caixa<T> {

	private T nessinha;
	
	public void guardar(T coisa) {
		this.nessinha = coisa;
	}

	public T abrir() {
		return nessinha;
	}
	
}
