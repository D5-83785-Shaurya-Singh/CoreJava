import java.util.Scanner;

public class Account 
{
	public static float acc_bal;

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your account number: ");
		int acc_no = sc.nextInt();
		
		System.out.println("Pending balance: ");
		float p_bal = sc.nextFloat();
		//acc_bal = p_bal;
		
		System.out.println("Amount of purchase made: ");
		float purchase = sc.nextFloat();
		
		System.out.println("Credit applied in this month: ");
		float cred = sc.nextFloat();
		
		System.out.println("Allowed credit: ");
		float limit = sc.nextFloat();
		
		acc_bal = (p_bal + purchase) - cred;
		
		System.out.println("Updated account balance is: "+acc_bal);
		
		if(acc_bal < limit)
		{
			System.out.println("Credit limit exceeded!!");
		}
		else if(acc_bal > limit)
		{
			System.out.println("Allowed to make next purchase");
		}

	}

}

//calculate the new balance (= beginning balance+ 
//charges – credits), display the new balance
