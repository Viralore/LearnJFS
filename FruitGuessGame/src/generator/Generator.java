package generator;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Generator 
{
	private static final Random random = new Random();
	
	private static final int PLAYER_ID_LENGTH = 5;
    private static final Set<Integer> generatedPlayerID = new HashSet<>();
    
    private static final int GAME_SESSION_ID_LENGTH = 6;
    private static final Set<Integer> generatedGameSessionID = new HashSet<>();

    
    public static int generateUniquePlayerID() 
    {
        int playerID;
        do 
        {
        	playerID = generateRandomPlayerID();
        } while (generatedPlayerID.contains(playerID));
        generatedPlayerID.add(playerID);
        return playerID;
    }

    private static int generateRandomPlayerID() 
    {
        StringBuilder playerIDBuilder = new StringBuilder();
        for (int i = 0; i < PLAYER_ID_LENGTH; i++) 
        {
            int digit = random.nextInt(10); // Generate a random digit between 0 and 9
            playerIDBuilder.append(digit);
        }
        return Integer.parseInt(playerIDBuilder.toString());
    }
    
    public static int generateUniqueGameSessionID() 
    {
        int gameSessionID;
        do 
        {
        	gameSessionID = generateRandomGameSessionID();
        } while (generatedGameSessionID.contains(gameSessionID));
        generatedGameSessionID.add(gameSessionID);
        return gameSessionID;
    }

    private static int generateRandomGameSessionID() 
    {
        StringBuilder gameSessionIDBuilder = new StringBuilder();
        for (int i = 0; i < GAME_SESSION_ID_LENGTH; i++) 
        {
            int digit = random.nextInt(10); // Generate a random digit between 0 and 9
            gameSessionIDBuilder.append(digit);
        }
        return Integer.parseInt(gameSessionIDBuilder.toString());
    }
    
}