//03 different ways to reverse a string
//01. Our own method() to reverse a string
//02. Using StringBuffer class reverse method
//03. Using StringBuilder class reverse method
public class Assgn9 
{
	public static String revString(String str)
	{
		char[] arr = str.toCharArray(); //converting String to character array
		
		int start = 0, end = arr.length - 1;
		while(start < end)
		{
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		return new String(arr); //converting the character array back to string
	}

	public static void revChar(char[] arr)
	{
		int start = 0, end = arr.length-1;
		char temp;
		while(start < end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end--;
			start++;
		}
	}
	
	public static void main(String[] args) 
	{
		
		char[] c1 = {'A','B','C','D','E'};
		revChar(c1);  //reversing a character array
		for(char ele: c1)
		{
			System.out.print(ele);
		}
		
		System.out.println();
		
		String s1 = new String("Running");
		System.out.println("Original String: "+s1);
		String s2 = revString(s1);  
		System.out.println("Reversed string: "+s2);
		
		
		//There is are two more methods to reverse a string
		StringBuffer s3 = new StringBuffer(s1); //StringBuffer class makes strings mutable //thread safe
		s3.reverse();
		System.out.println(s3);
		
		StringBuilder s4 = new StringBuilder(s1);
		System.out.println(s4.reverse()); //StringBuilder class also make string mutable //but thread unsafe
		
		
		
		

	}

}
