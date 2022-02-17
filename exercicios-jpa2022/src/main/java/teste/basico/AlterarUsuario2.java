package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		System.out.println(usuario.getNome() + " " + usuario.getEmail());
		
		
		em.detach(usuario); // tirar o objeto do estado gerenciado
	
		usuario.setNome("Nessildes");
		
		em.merge(usuario);
		
		em.getTransaction().commit();;
		
		em.close();
		emf.close();

	}

}
