package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		System.out.println(usuario.getNome());
		
//		Query a = em.createNativeQuery("select * from usuario".toString());
//		System.out.println(a.getResultStream());
		
		em.close();
		emf.close();

	}

}
