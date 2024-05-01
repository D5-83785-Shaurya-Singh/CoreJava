//here we are using two ways to check if a string is palindrome or not
//01. by using our own method
// 02. by using reverse() from StringBuffer and StringBuilder class
import java.util.Scanner;

public class Assgn9_02 
{
	public static boolean strPalindrome(String s)
	{
		char[] crr = s.toCharArray();
		int start = 0, end = crr.length - 1;
		while(start < end)
		{
			if(crr[start] == crr[end])
			{
				start++;
				end--;
				return true;
			}
			else
				return false;
		}
		return false;
	}
	
	public static boolean isPalindrome(String str)
	{
		// Create a StringBuilder object initialized with the original string
        StringBuilder reversed = new StringBuilder(str);
        // Reverse the string using the StringBuilder's reverse method
        reversed.reverse();
        // Convert the StringBuilder object back to a string using the toString method
        String reversedStr = reversed.toString();
        // Compare the original string with the reversed string and return the result
        return str.equals(reversedStr);
	}

	public static void main(String[] args) 
	{
		//sample palindrome string is "racecar"
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string to check if it is palindrome or not: ");
		String s1 = sc.next();
		System.out.println("Entered string is: "+s1);
		
		boolean b1 = strPalindrome(s1);
		System.out.println(b1);
			
		
		 System.out.println("Is \"" + s1 + "\" a palindrome? " + isPalindrome(s1));

	}

}
