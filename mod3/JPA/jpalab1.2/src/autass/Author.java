package autass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Author {

	public static void main(String[] args) {
		AuthorDetails author=new AuthorDetails();
	author.setAuthorId(2);
	author.setFirstName("chaithanya");
	author.setMiddleName("koushik");
	author.setLastName("namala");
	author.setPhoneNo("7223456789");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(author);
        AuthorDetails ad=em.find(AuthorDetails.class,8);
        AuthorDetails ad1=em.find(AuthorDetails.class,3);
        System.out.println(ad);
        em.remove(ad);
       ad1.setLastName("sathi");
     
         em.getTransaction().commit();
         System.out.println("Data Saved");
        
      
  
		
	}

}
