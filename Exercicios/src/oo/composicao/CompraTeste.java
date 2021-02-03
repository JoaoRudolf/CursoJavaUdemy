package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "João";
		//c1.itens.add(new Item("Batata", 5, 7.4));
		//c1.itens.add(new Item("Chuchu", 6, 3.5));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.cliente + " comprou " + c1.itens.toString());
		System.out.println(c1.obterValorTotal());
	}

}
