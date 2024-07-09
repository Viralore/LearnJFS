package libraryHib;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Department;
import com.model.Employee;
import com.model.Project;

public class Main4 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try
		{
			emf = Persistence.createEntityManagerFactory("libPUPractice");
			em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			Employee employee = em.find(Employee.class, 105);
			List<Project> projects = employee.getProjects();
			projects.forEach(obj -> System.out.println(obj.getTitle() + " " + obj.getAmount()));
			
			Department department = em.find(Department.class, 3);
			List<Employee> employees = department.getEmployees();
			employees.forEach(obj -> System.out.println(obj.getName()));
			em.getTransaction().commit();
			
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
