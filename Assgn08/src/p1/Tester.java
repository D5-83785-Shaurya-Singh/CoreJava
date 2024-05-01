package p1;

import java.util.Scanner;

public class Tester 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		try
		{
			String s1 = sc.next();
			int len1 = s1.length();
			if(len1 > 80)
			{
				throw new ExceptionLineTooLong();
			}
			else
			{
				System.out.println("Length of the string is: "+len1);
			}
			
			
		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		catch(ExceptionLineTooLong e)
		{
			System.out.println("Inside catch block");
		}
		finally
		{
			System.out.println("Inside finally block for closing the resource");
			sc.close();
		}
		
		System.out.println("Test case!!!");
		

	}

}
