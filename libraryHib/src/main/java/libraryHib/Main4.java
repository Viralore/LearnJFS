package libraryHib;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.MatchDetails;
import com.model.Player;
import com.model.Team;

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
			
//			em.getTransaction().begin();
//			
//			Employee employee = em.find(Employee.class, 105);
//			List<Project> projects = employee.getProjects();
//			projects.forEach(obj -> System.out.println(obj.getTitle() + " " + obj.getAmount()));
//			
//			Department department = em.find(Department.class, 3);
//			List<Employee> employees = department.getEmployees();
//			employees.forEach(obj -> System.out.println(obj.getName()));
//			em.getTransaction().commit();
			
			
			//Filling players in database
//			em.getTransaction().begin();
//			Player player1 = new Player();
//			Player player2 = new Player();
//			player1.setPlayerName("GIGN");
//			player2.setPlayerName("Seal");
//			Team team = em.find(Team.class, 4);
//			PlayingKit kit1 = em.find(PlayingKit.class, 8);
//			PlayingKit kit2 = em.find(PlayingKit.class, 9);
//			player1.setTeam(team);
//			player2.setTeam(team);
//			player1.setPlayingKit(kit1);
//			player2.setPlayingKit(kit2);
//			em.persist(player1);
//			em.persist(player2);
//			em.getTransaction().commit();
			
			Player player = em.find(Player.class, 503);
			List<MatchDetails> matches = player.getMatches();
			matches.forEach(obj -> System.out.println(obj.getPlace()));
			
			Team team = em.find(Team.class, 4);
			List<Player> players = team.getPlayers();
			players.forEach(obj -> System.out.println(obj.getPlayerName()));
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
