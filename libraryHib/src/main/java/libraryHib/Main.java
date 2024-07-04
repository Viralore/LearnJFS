package libraryHib;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
//		}
		
		try
		{
			emf = Persistence.createEntityManagerFactory("libPU");
			em = emf.createEntityManager();
			Student student = em.find(Student.class, 2408);
			System.out.println(student);
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
