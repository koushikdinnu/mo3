package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Author {

	public static void main(String[] args) {
		AuthorDetails author=new AuthorDetails();
		author.setAuthorId(2);
		author.setFirstName("sri");
		author.setMiddleName("lekha");
		author.setLastName("yerra");
		author.setPhoneNo("7285593930");
		EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("JPA-PU");
        EntityManager em = factory.createEntityManager();

 

        em.getTransaction().begin();
        em.persist(author);
        System.out.println("Data Saved");
   
         AuthorDetails au=em.find(AuthorDetails.class,2);
         em.remove(au);
         em.getTransaction().commit();
        
      
  
		
	}

}
