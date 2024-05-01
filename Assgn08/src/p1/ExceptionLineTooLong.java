package p1;

public class ExceptionLineTooLong extends Exception //checked Exception
{
	ExceptionLineTooLong()
	{
		System.out.println("String length cannot exceed 80 characters!!");
	}
	
	ExceptionLineTooLong(String s)
	{
		System.out.println(s);
	}
}
