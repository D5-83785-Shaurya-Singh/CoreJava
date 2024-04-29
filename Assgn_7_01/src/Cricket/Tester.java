package Cricket;

import java.util.Scanner;

public class Tester 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Player[] team = new Player[11];
		int choice;
		int count = 0;
		
		do
		{
			System.out.println("0. Exit");
			System.out.println("1. Add Batter");
			System.out.println("2. Add Bowler");
			System.out.println("3. Display team");
			System.out.println("4. Display total runs, wickets and matches");
			System.out.println("5. Display each cricketer by name and no of matches played by them individually");
			
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				if(count < 11)
				{
					team[count] = new Cricketer(); //upcasting 
					team[count].accept(); //late binding
					count++;
					System.out.println("Batter added!!");
					
				}
				else
				{
					System.out.println("11 players are already added!!");
				}
				break;
			}
			
			case 2:
			{
				if(count < 11)
				{
					team[count] = new Cricketer();
					team[count].accept();
					count++;
					System.out.println("Bowler added!!");
				}
				else
				{
					System.out.println("11 players are already added!!");
				}
				break;
			}
			
			case 3:
			{
				for(Player ele: team)
				{
					if(ele instanceof Cricketer)
					{
						Cricketer c1 = (Cricketer) ele; //downcasting
						System.out.println(c1);
					}
					System.out.println("Test");
				}
				break;
			}
			
			case 4:
			{
				int team_runs = 0;
				int team_wickets = 0;
				int team_matches = 0;
				for(Player ele:team)
				{
					if(ele instanceof Cricketer)
					{
						Cricketer c1 = (Cricketer) ele; //downcasting
						team_runs += c1.runs;
						team_wickets += c1.wickets;
						team_matches += c1.matchesPlayed;
						
					}
					
					
				}
				System.out.println("Total number of runs amassed by men in blue: "+team_runs);
				System.out.println("Total number of wickets taken by men in blue: "+team_wickets);
				System.out.println("Total experience of the team: "+team_matches);
				break;
			}
			
			case 5:
			{
				System.out.println("");
				for(Player ele: team)
				{
					if(ele instanceof Cricketer)
					{
						Cricketer c1 = (Cricketer) ele; //downcasting
						System.out.println("Player: "+c1.name+" Experience: "+c1.matchesPlayed);
					}
					
					//System.out.println(ele.matchesPlayed);
				}
				break;
			}
			}//end of switch case
			
		}while(choice != 0);//end of do while
		
		
		

	}//end of main()

}//end of tester class
