package main;

import com.groupeisi.entities.Role;
import com.groupeisi.entities.User;
import com.groupeisi.repository.IRole;
import com.groupeisi.repository.IUser;
import com.groupeisi.repository.RoleImpl;
import com.groupeisi.repository.UserImpl;

public class Main {

	public static void main(String[] args) {
		
		IRole iRole = new RoleImpl();
		IUser iUser = new UserImpl();
		
		Role role = new Role();		
		role.setId(1);
		role.setNom("ROLE_SUPERADMIN");
		
		User user = new User();
		user.setId(1);
		user.setPrenom("Sanoussy");
		user.setNom("GASSAMA");
		user.setEmail("gassama@gmail.com");
		user.setPassword("passer");
		user.setEtat(1);
		
		int result = iUser.saisie(user);
		
		iRole.terminate();
		iUser.terminate();
		
		if(result == 1) 
			System.out.println("Insertion avec succés.");
		else 
			System.out.println("Insertion échouée !!!");;
			
		
		/*public static void main(String[]argv) {    
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("MaBaseDeTestPU");    
		    EntityManager em = emf.createEntityManager();    
		    EntityTransaction transac = em.getTransaction();
		    transac.begin();
		    Personne nouvellePersonne = new Personne();
		    nouvellePersonne.setId(4);
		    nouvellePersonne.setNom("nom4");
		    nouvellePersonne.setPrenom("prenom4");
		    em.persist(nouvellePersonne);
		    transac.commit();
		    
		    em.close();    
		    emf.close();  
		  } */
		
	}

}

