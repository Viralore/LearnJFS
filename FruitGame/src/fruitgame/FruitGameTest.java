package fruitgame;

import java.util.*;
import javax.swing.*;

public class FruitGameTest 
{
    String name;
    static String[] fruitNames = new String[100];
    static int index = 0;

    public void setName(String name) 
    {
        this.name = name;
    }

    public void promptAndGetWord(String fruitName) 
    {
        if (index < fruitNames.length) 
        {
            fruitNames[index++] = fruitName;
        } 
        else 
        {   
            String[] temp = new String[fruitNames.length*2];
            for(int i=0;i<fruitNames.length;i++)
            {
            	temp[i] = fruitNames[i];
            }
            fruitNames = temp;
        }
    }

    public static boolean searchFruit(String fruitName) 
    {
        for (int i = 0; i < index; i++) 
        {
            if (fruitName.equalsIgnoreCase(fruitNames[i])) 
            {
                return true;
            }
        }
        return false;
    }

    public static String getFruitName(JFrame frame, String playerName) 
    {
        JPasswordField passwordField = new JPasswordField();
        Object[] message = {playerName + ", Enter Fruit Name:", passwordField};

        int option = JOptionPane.showConfirmDialog(frame, message, "Fruit Name", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (option == JOptionPane.OK_OPTION) 
        {
            char[] fruitName = passwordField.getPassword();
            String fruit = new String(fruitName);

            Arrays.fill(fruitName, ' ');

            return fruit;
        } 
        else 
        {
            return null;
        }
    }

    public static void playGame(FruitGameTest player1, FruitGameTest player2, JFrame frame) 
    {
        boolean check = true;
        int turn = 0;

        Game:
        while (check) 
        {
            FruitGameTest currentPlayer = (turn % 2 == 0) ? player1 : player2;
            FruitGameTest otherPlayer = (turn % 2 == 0) ? player2 : player1;

            String playerName = currentPlayer.name;
            String otherPlayerName = otherPlayer.name;

            System.out.println("Player's Turn: " + playerName);
            String name = getFruitName(frame, playerName);
            if (name == null) 
            {
                System.out.println("No input provided. Exiting game.");
                break;
            }
            if (searchFruit(name)) 
            {
                System.out.println("Player: " + otherPlayerName + " won the GAME!!!");
                System.out.println("Thanks for Playing the FruitGame!!!");
                break Game;
            }
            currentPlayer.promptAndGetWord(name);

            turn++;
        }
    }

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(false);

        Scanner in = new Scanner(System.in);
        FruitGameTest player1 = new FruitGameTest();
        FruitGameTest player2 = new FruitGameTest();

        System.out.print("Player 1: Enter the name: ");
        player1.setName(in.nextLine());

        System.out.print("Player 2: Enter the name: ");
        player2.setName(in.nextLine());

        playGame(player1, player2, frame);

        in.close();
    }
}
