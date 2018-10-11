import java.util.Scanner;

public class VolleyballServe
	{
		static String[][] Layout; 

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
		System.out.println("Great!" + bestPlayerName + "! Now it is time to beat our rivals!");
		Layout = new String [3][3];
		for (int i = 0; i < 3; i++)
			{
			for (int j = 0; j <3; j++)
				{
				Layout [i][j] = " "; 
				}
			}
		System.out.println("Alright! Let's go to the court!");  
		System.out.println("              A                            B                              C                 ");
		System.out.println("  -------------------------------------------------------------------------------------");
		System.out.println("  |    " + Layout[0][0]  + "    | "  + Layout[0][1] +  "    |  " + Layout[0][2]    +  "|");
		System.out.println("1 |                             |                           |                          |");
		System.out.println("  |                             |                           |                          |");
		System.out.println("  --------------------------------------------------------------------------------------");
		System.out.println("  |    " + Layout[1][0]  + "    | "  + Layout[1][1] +  "    |  " + Layout[1][2]    +  "|");
		System.out.println("2 |                             |                           |                          |");
		System.out.println("  |                             |                           |                          |");
		System.out.println("  --------------------------------------------------------------------------------------");
		System.out.println("  |    " + Layout[2][0]  + "    | "  + Layout[2][1] +  "    |  " + Layout[2][2]    +  "|");
		System.out.println("3 |                             |                           |                          | ");
		System.out.println("  |                             |                           |                          |");
		System.out.println("   -------------------------------------------------------------------------------------");
	
		}
		
		public static void createPlayers()
		{
		System.out.println("Okay now that you've seen the court and are familiar with it, let's check out the competion! ;)");
		System.out.println("              A                            B                              C                 ");
		System.out.println("  -------------------------------------------------------------------------------------");
		System.out.println("  |    " + Layout[0][0]  + "    | "  + Layout[0][1] +  "    |  " + Layout[0][2]    +  "|");
		System.out.println("1 |                             |                           |                          |");
		System.out.println("  |                             |                           |                          |");
		System.out.println("  --------------------------------------------------------------------------------------");
		System.out.println("  |    " + Layout[1][0]  + "    | "   +  " Libero  "   +   "|  " + Layout[1][2]    +  "|");
		System.out.println("2 |                             | "   +Layout[1][1]    +   "|                          |");
		System.out.println("  |                             |                           |                          |");
		System.out.println("  --------------------------------------------------------------------------------------");
		System.out.println("  |    " + "terrible player"+ " | "  + "okayish player" +  "|"  +"terrible player" +  "|");
		System.out.println("3 | "    +Layout[2][0]      + " | "  +Layout[2][1]      +  "|"  + Layout[2][2]    +   "| ");
		System.out.println("  |                             |                           |                          |");
		System.out.println("   -------------------------------------------------------------------------------------");
		}
		
		public static void playVolleyball()
		{
		
		}

	}
