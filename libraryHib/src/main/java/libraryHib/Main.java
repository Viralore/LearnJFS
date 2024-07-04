package libraryHib;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Issue;

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
//		}
		
		//For Student
//		try
//		{
//			emf = Persistence.createEntityManagerFactory("libPU");
//			em = emf.createEntityManager();
//			Student student = em.find(Student.class, 2408);
//			System.out.println(student);
//		}
		
		//For Issue
		//Cannot be null -> issue.fine
		try
		{
			emf = Persistence.createEntityManagerFactory("libPU");
			em = emf.createEntityManager();
			Issue issue = em.find(Issue.class, 101);
			System.out.println(issue);
		}
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
