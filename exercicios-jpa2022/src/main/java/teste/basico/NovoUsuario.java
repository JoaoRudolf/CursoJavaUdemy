package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = new Usuario("maga", "magali@joao.br");
		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
	
		
		em.close();
		emf.close();
		

	}

}
