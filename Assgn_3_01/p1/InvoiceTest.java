package p1;

public class InvoiceTest 
{

	public static void main(String[] args) 
	{
		Invoice obj1 = new Invoice();//parameterless constructor will be called
		obj1.accept(); //accepting the data
		obj1.display(); //displaying the data
		
		double d1 = obj1.calTotal(); //calculating the total
		
		System.out.println("Total bill is: "+d1);//displaying the total
		
		Invoice obj2 = new Invoice("a101", "MeasuringTape", 299, 1);
		obj2.display();
		
		Invoice obj3 = new Invoice("a101", "AdhesiveTape", 129, -5);
		obj3.display();

	}

}
