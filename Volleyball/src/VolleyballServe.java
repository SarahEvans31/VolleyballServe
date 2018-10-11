import java.util.Scanner;

public class VolleyballServe
	{

		public static void main(String[] args)
			{
			createCourt();
			createPlayers();
			playVolleyball();	
			}
		
		public static void createCourt()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome player! Are you ready to play some volleyball? Of course you are :)");
		System.out.println("What is you name first off, that way we can yell your name over the loud speaker when you get a service ace!");
		String bestPlayerName = userInput.nextLine(); 
		System.out.println("Great!" + bestPlayerName + "Now it is time to beat our rivals");
		}
		
		public static void createPlayers()
		{
			
		}
		
		public static void playVolleyball()
		{
		
		}

	}
