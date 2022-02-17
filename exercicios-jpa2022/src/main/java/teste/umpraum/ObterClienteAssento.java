package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		 DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		 Cliente cliente = daoCliente.obterPorId(10L);
		 System.out.println(cliente.getAssento().getNome());
		 System.out.println(cliente.getAssento().getCliente().getNome());
		 daoCliente.fechar();

		 DAO<Assento> daoAssento = new DAO<>(Assento.class);
		 Assento assento = daoAssento.obterPorId(14L);
		 
		 System.out.println(assento.getCliente().getNome());
		 System.out.println(assento.getCliente().getAssento().getNome());
		 
		 daoAssento.fechar();
	}
}
