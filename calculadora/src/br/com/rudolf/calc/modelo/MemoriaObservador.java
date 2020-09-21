package br.com.rudolf.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	
	void valorAlterado(String novoValor);
}
