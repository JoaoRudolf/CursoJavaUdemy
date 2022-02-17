package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 3L);
		
		if (usuario != null) {
			try {
				em.getTransaction().begin();
				em.remove(usuario);
				em.getTransaction().commit();;
				System.out.println(usuario.getNome() + " exclu�do ");
			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}
			
		} else {
			System.out.println("usuario inv�lido");
		}
		
		

	

		
		
		em.close();
		emf.close();
	}

}
