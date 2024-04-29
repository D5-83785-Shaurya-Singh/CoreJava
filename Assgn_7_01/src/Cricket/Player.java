package Cricket;

import java.util.Scanner;

public abstract class Player 
{
	int id;
	String name;
	int age;
	int matchesPlayed;
	static int generateId;
	
	static {
		generateId = 100;
	}
	
	
	public Player() 
	{
		super();
		this.id = ++generateId;
		
	}


	public Player(String name, int age, int matchesPlayed) 
	{
		super();
		this.id = ++generateId;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}


	public int getId() {
		return id;
	}


	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMatchesPlayed() {
		return matchesPlayed;
	}


	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}


	@Override
	public String toString() 
	{
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed + "]";
	}
	
	public void accept()
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter cricketer's name: ");
		this.name = sc.next();
		System.out.println("Enter age: ");
		this.age = sc.nextInt();
		System.out.println("Enter cricketer's experience: ");
		this.matchesPlayed = sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("Cricketer's id: "+generateId);
		System.out.println("Cricketer's name: "+this.name);
		System.out.println("Cricketer's age: "+this.age);
	}
	
	
}
