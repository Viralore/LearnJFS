package libraryHib;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Player;

/*
 * Create classes -> Team, Player, and PlayingKit
 * Add associations -> OneToOne and ManyToOne 
 */

public class Main3 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try
		{
			emf = Persistence.createEntityManagerFactory("libPUPractice");
			em = emf.createEntityManager();
	
			//Setting data into the tables -> Player, Team, and PlayingKit
//			em.getTransaction().begin();
//			Team team = new Team();
//			team.setTeamName("CT");
//			em.persist(team);
//			em.getTransaction().commit();
//			
//			em.getTransaction().begin();
//			PlayingKit playingKit = new PlayingKit();
//			em.persist(playingKit);
//			em.getTransaction().commit();
//			
//			em.getTransaction().begin();
//			Player player = new Player();
//			player.setPlayerName("SAS");
//			player.setTeam(team);
//			em.persist(player);
//			em.getTransaction().commit();
			
			
			//setting playing kit for player with id 6 and printing the details
//			em.getTransaction().begin();
//			Player player = em.find(Player.class, 6);
//			PlayingKit playingKit = em.find(PlayingKit.class, 5);
//			player.setPlayingKit(playingKit);
//			em.getTransaction().commit();
//			
			Player player = em.find(Player.class, 6);
			System.out.println(player);
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
