package generics;

import java.util.SortedSet;
import java.util.TreeSet;

public class Pares<C extends Number, V> {
	
	private final SortedSet<Par<C, V>> itens = new TreeSet<>();

	public void adicionar(C chave, V valor) {
		if(chave == null) return;
			Par<C, V> novoPar = new Par<C, V>(chave, valor);
			
			itens.add(new Par<C, V>(chave, valor));
			
			if(itens.contains(novoPar)) {
				itens.remove(novoPar);
			}
			
			//itens.add(novoPar)chave;
		}
	};


