import java.util.Scanner;

public class Assgn_01 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please  enter first value: ");
		boolean b1 = sc.hasNextDouble();
		//System.out.println(b1);
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter second value: ");
		boolean b2 = sc1.hasNextDouble();
		//System.out.println(b2);
		
		if(b1 == true && b2 == true)
		{
			double d1 = sc.nextDouble();
			double d2 = sc1.nextDouble();
			double avg = (d1+d2)/2;
			System.out.println("Average is: "+avg);
		}
		else
		{
			System.out.println("Please enter double values!!");
		}
		sc.close();
		sc1.close();
		
	}

}
