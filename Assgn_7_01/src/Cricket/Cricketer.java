package Cricket;

import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler 
{
	int runs;
	int wickets;
	

	public Cricketer() 
	{
		super();
	}

	public Cricketer(String name, int age, int matchesPlayed, int runs, int wickets) 
	{
		super(name, age, matchesPlayed);
		this.runs = runs;
		this.wickets = wickets;
		
	}


	public int getRuns() 
	{
		return runs;
	}

	public void setRuns(int runs) 
	{
		this.runs = runs;
	}

	
	public int getWickets() 
	{
		return wickets;
	}

	public void setWickets(int wickets) 
	{
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return "Cricketer [runs=" + runs + ", wickets=" + wickets + ", id=" + id + ", name=" + name + ", age=" + age
				+ ", matchesPlayed=" + matchesPlayed + "]";
	}

	
	public void accept()
	{
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter runs scored: ");
		this.runs = sc.nextInt();
		System.out.println("Enter wickets taken: ");
		this.wickets = sc.nextInt();
	}
	
	public void display()
	{
		super.display();
		System.out.println("Runs scored: "+this.runs);
		System.out.println("Wickets taken: "+this.wickets);
		System.out.println();
	}
	
	
	
	
	
	
}
