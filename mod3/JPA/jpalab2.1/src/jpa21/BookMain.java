package jpa21;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookMain {

	public static void main(String[] args) {
		
		

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager em = factory.createEntityManager();
        
        Author author=new Author();
        Book book1=new Book();
		Book book2=new Book();
		book1.setISBN("ISBN-6");
		book1.setTitle("dsbgf");
		book1.setPrice("500");
		book2.setISBN("ISBN-7");
		book2.setTitle("refg");
		book2.setPrice("600");
        author.getBook().add(book1);
        author.getBook().add(book2);
        author.setId(109);
        author.setName("siri");
        em.getTransaction().begin();
        em.persist(author);
        em.persist(book1);
        em.persist(book2);
        em.getTransaction().commit();
        System.out.println("Data Saved");
	}

}
