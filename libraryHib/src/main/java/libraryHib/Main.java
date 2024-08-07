package libraryHib;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Book;
import com.model.Student;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("Maven Project Running");
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		//For Book
//		try
//		{
//			emf = Persistence.createEntityManagerFactory("libPU");
//			em = emf.createEntityManager();
//			Book book = em.find(Book.class,1);
//			System.out.println(book);
//			Book book2 = em.find(Book.class,2);
//			System.out.println(book2);
//			Book book3 = em.find(Book.class,3);
//			System.out.println(book3);
//			
//			//Object already present in memory
//			//no query called returned the already present object
//			Book book4 = em.find(Book.class,1);
//			System.out.println(book4);
//		}
		
		//For Student
		try
		{
			emf = Persistence.createEntityManagerFactory("libPU");
			em = emf.createEntityManager();
//			Student student = em.find(Student.class, 2408);
//			System.out.println(student);
			
			//How to get all the students
			//here Student is class mapped to student table (automatically done by Hibernate)
//			Query query = em.createQuery("from Student");
//			List<?> list = query.getResultList();
//			list.forEach(obj -> System.out.println(obj));
			
			//to get one student 
//			Query query = em.createQuery("from Student s where s.roll = 2401");
//			List<?> list = query.getResultList();
//			list.forEach(obj -> System.out.println(obj));
			
			Student student = em.find(Student.class, 2401);
			System.out.println(student);
			
			//Already executed no need to run again
//			em.getTransaction().begin();
//			student.setName("Akash missing");
//			em.getTransaction().commit();
			
			//How to automatically increment primary key using sequence table (which automatically generated by hibernate)
//			em.getTransaction().begin();
//			Book newBook = new Book(0,"Java with ORM","Rachit","LPU");
//			em.persist(newBook);
//			em.getTransaction().commit();
//			System.out.println(newBook);
			
			//deleting a book -> performed
			//commenting these because they are already commited in database no need to call them every time
//			em.getTransaction().begin();
//			Book delBook = em.find(Book.class, 13);
//			em.remove(delBook);
//			em.getTransaction().commit();
			
			
		}
		
		//For Issue
		//Cannot be null -> issue.fine
//		try
//		{
//			emf = Persistence.createEntityManagerFactory("libPU");
//			em = emf.createEntityManager();
//			Issue issue = em.find(Issue.class, 101);
//			System.out.println(issue);
//		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
			emf.close();
		}
	}
}
