import java.util.Scanner;

public class Assgn_02 
{
	static int generate_bill;

	public static void main(String[] args) 
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("-----FOOD MENU-----");
		System.out.println();
		do {
			System.out.println("Food menu:\n 0.Exit\n 1.Dosa--------110/-\n 2.Idli--------50/-\n 3.Samosa------15/-\n");
			System.out.println("Please add the items that you would want to purchase: ");
			choice = sc.nextInt();
			
			switch(choice){
			case 1:
				generate_bill+=110;
				break;
				
			case 2:
				generate_bill+=50;
				break;
				
			case 3:
				generate_bill+=15;
			}
			
		}while(choice != 0);
		
		
		System.out.println("Your total bill is: "+generate_bill);
		
		
		

	}

}




