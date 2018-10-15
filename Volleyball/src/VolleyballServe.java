import java.util.Scanner;

public class VolleyballServe
	{
		static String[][] Layout; 
		static int ourTeamPoints;
		static int otherTeamPoints; 

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
		System.out.println("  |    " + Layout[0][0]  + "     "  + Layout[0][1] +  "      " + Layout[0][2]    +  "   ");
		System.out.println("1 |                             |                           |                          |");
		System.out.println("  |                             |                           |                          |");
		System.out.println("  --------------------------------------------------------------------------------------");
		System.out.println("  |    " + Layout[1][0]  + "     "  + Layout[1][1] +  "      " + Layout[1][2]    +  "");
		System.out.println("2 |                             |                           |                          |");
		System.out.println("  |                             |                           |                          |");
		System.out.println("  --------------------------------------------------------------------------------------");
		System.out.println("  |    " + Layout[2][0]  + "     "  + Layout[2][1] +  "      " + Layout[2][2]    +  "");
		System.out.println("3 |                             |                           |                          | ");
		System.out.println("  |                             |                           |                          |");
		System.out.println("   -------------------------------------------------------------------------------------");
		System.out.println("Okay now that you've seen the court and are familiar with it, let's check out the competion! ;)");

		}
		
		public static void createPlayers()
		{
		System.out.println("              A                            B                              C                 ");
		System.out.println("  -------------------------------------------------------------------------------------");
		System.out.println("  |    " + Layout[0][0]  + "     "  + Layout[0][1] +  "     " + Layout[0][2]    +  "    ");
		System.out.println("1 |    Right Back #12           |                           |      Left Back  #7       |");
		System.out.println("  |                             |                           |                          |");
		System.out.println("  --------------------------------------------------------------------------------------");
		System.out.println("  | "       +Layout[1][0]  + "     " +Layout[1][1]    +  "     "  + Layout[1][2]   +"    ");
		System.out.println("2 |                             |         Libero   #2       |                          |");
		System.out.println("  |                             |                           |                          |");
		System.out.println("  --------------------------------------------------------------------------------------");
		System.out.println("  |  " + Layout[2][0]      + "  "    +Layout[2][1]      +  " "  + Layout[2][2]    +   "");
		System.out.println("3 |    Right Side Hitter #13    |   Middle Blocker #12      |  Outside Hitter #9       | ");
		System.out.println("  |                             |                           |                          |");
		System.out.println("   -------------------------------------------------------------------------------------");
		System.out.println("Hmmmm looks like we've got some good competion today don't you think?");
		Scanner userInput1 = new Scanner(System.in);
		String answer = userInput1.nextLine(); 
		if (answer == "yes")
			{
			System.out.println("I guess you are right, but we can beat them because we've got the best server on our side!");
			}
		else
			{
			System.out.println("Haha I like your attitude, but don't get too cocky.");
			}
		System.out.println("Alright! Let's get to playing!");
		}
		
		public static void playVolleyball()
		{
		int ourTeamPoints = 19; 
		int otherTeamPoints = 19; 
		System.out.println("Senario: The score is 19 - 19 and our team has the ball back so we can serve! Thank the Lord that you are back to serve!"); 
		while (ourTeamPoints <= 25 || otherTeamPoints <= 25)
			{
			String [][] Layout = new String [3][3];
			Layout[0][0] = "Right Back #12";
			Layout[1][0] = " "; 
			Layout[2][0] = "Right Side Hitter #13";
			Layout[0][1] = " ";
			Layout[1][1] = " Libero #2";
			Layout[2][1] = "Middle Blocker #12";
			Layout[0][2] = "Left Back #7";
			Layout[1][2] = " ";
			Layout[2][2] = "Outside Hitter #9";
			
			String A1 = Layout[0][0];
			String A2 = Layout[1][0];
			String A3 = Layout[2][0];
			String B1 = Layout[0][1];
			String B2 = Layout[1][1];
			String B3 = Layout[2][1];
			String C1 = Layout[0][2];
			String C2 = Layout[1][2];
			String C3 = Layout[2][2]; 
				
		System.out.println("              A                            B                              C                 ");
		System.out.println("  -------------------------------------------------------------------------------------");
		System.out.println("  |         " + Layout[0][0]  + "                  "   + Layout[0][1] +  "                 " + Layout[0][2]    +  "    ");
		System.out.println("1 |                             |                           |                          |");
		System.out.println("  |                             |                           |                          |");
		System.out.println("  --------------------------------------------------------------------------------------");
		System.out.println("  | "           +Layout[1][0]  + "                                     " +Layout[1][1]    +  "                              "  + Layout[1][2]   +"    ");
		System.out.println("2 |                             |                           |                          |"); 
		System.out.println("  |                             |                           |                          |");
		System.out.println("  --------------------------------------------------------------------------------------");
		System.out.println("      " + Layout[2][0]      + "        "    +Layout[2][1]      +  "          "  + Layout[2][2]    +   "");
		System.out.println("3 |                             |                           |                          | ");
		System.out.println("  |                             |                           |                          |");
		System.out.println("   -------------------------------------------------------------------------------------"); 
		
		System.out.println("Pick a spot to serve!");
		Scanner userInput2 = new Scanner(System.in);
		String serviceAce = userInput2.nextLine();
		if (serviceAce == A1)
			{
			System.out.println("Great decision! The right back player is not the best serve reciever on the team! You got a service ace!");
			ourTeamPoints++; 
			System.out.println("The score is: " + ourTeamPoints + " to " +otherTeamPoints);
			}
		
		if (serviceAce  == A2)
			{
			System.out.println("Yes!! That spot is completetly open! You got a service ace!");
			ourTeamPoints++; 
			System.out.println("The score is: " + ourTeamPoints + " to " +otherTeamPoints);
			}
		
		if (serviceAce == A3)
			{
			System.out.println("Awe, #13 made a perfect pass for a perfect hit, we lost the point!");
			otherTeamPoints++; 
			System.out.println("But thankfully the next server served the ball in the net and we have the ball back!");
			ourTeamPoints++; 
			System.out.println("The score is: " + ourTeamPoints + " to " +otherTeamPoints);
			}
		
		if (serviceAce == B1)
			{
			System.out.println("Awesome! Perfect spot! A service ace! Serve again!");
			ourTeamPoints++; 
			System.out.println("The score is: " + ourTeamPoints + " to " +otherTeamPoints);
			}
		
		if (serviceAce == B2)
			{
			System.out.println("Awe you served it to the Libero, who is the best passer on the team, who got a perfecrt pass for a perfect hit from the middle. You lost a point!");
			otherTeamPoints++;
			System.out.println("The score is: " + ourTeamPoints + " to " +otherTeamPoints);
			}
		
		if (serviceAce == B3)
			{
			System.out.println("Yes! The middle blocker is the worst passer on the team! You got a point!");
			ourTeamPoints++; 
			System.out.println("The score is: " + ourTeamPoints + " to " +otherTeamPoints);
			}
		
		if (serviceAce == C1)
			{
			System.out.println("Awe #7 is a great passer who got a perfect pass, but thankfully the outside hitter hit the ball out of bounds! We got a point!");
			ourTeamPoints++; 
			System.out.println("The score is: " + ourTeamPoints + " to " +otherTeamPoints);
			}
		
		if (serviceAce == C2)
			{
			System.out.println("Great choice! But oh no! the left back player dives on the floor to save the ball! But thankfully the setter sets a double and we get the point!");
			ourTeamPoints++; 
			System.out.println("The score is: " + ourTeamPoints + " to " +otherTeamPoints);
			}
		
		if (serviceAce == C3)
			{
			System.out.println("Geez, that outside hitter got a perfect pass for a perfect hit off the block! We lost the point!");
			otherTeamPoints++;
			System.out.println("The score is: " + ourTeamPoints + " to " +otherTeamPoints);
			System.out.println(" *Wham!* Oh no! The other team's server got a service ace!");
			otherTeamPoints++; 
			System.out.println("The score is: " + ourTeamPoints + " to " +otherTeamPoints);
			System.out.println("Oh but thank goodness because the server just served it out of bounds! We got a point!");
			ourTeamPoints++; 
			System.out.println("The score is: " + ourTeamPoints + " to " +otherTeamPoints);
			}
		
		}
	}
} 