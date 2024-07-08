package libraryHib;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Department;
import com.model.Employee;

/*
 * Create classes -> Team, Player and PlayingKit
 * Set OneToOne and ManyToMany association
 * */

public class Main2 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try
		{
			emf = Persistence.createEntityManagerFactory("libPUPractice");
			em = emf.createEntityManager();
			System.out.println("DB connected, Persistence Unit Created");
			
			System.out.println("Finding employee 104");
			
			Employee employee = em.find(Employee.class, 104);
			System.out.println(employee);
			
			System.out.println("Finding department 3");
			Department department = em.find(Department.class, 3);
			System.out.println(department);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
			emf.close();
			System.out.println("emf closed");
		}
	}
}
