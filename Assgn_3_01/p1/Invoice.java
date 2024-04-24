package p1;

import java.util.Scanner;

public class Invoice 
{
	String part_id;
	String part_desc;
	double price;
	int quantity;
	
	public Invoice() 
	{
		this("1", "default", 100, 1); //
	}

	public Invoice(String part_id, String part_desc, double price, int quantity) //using if else inside parameterized constructor
	{																			//to handle negative price or quantity
		this.part_id = part_id;
		this.part_desc = part_desc;
		if(price < 0)
			this.price = price;
		else
			this.price = price;
		if(quantity < 0)
			this.quantity = 0;
		else
			this.quantity = quantity;	
	}

	public String getPart_id() {
		return part_id;
	}

	public void setPart_id(String part_id) {
		this.part_id = part_id;
	}

	public String getPart_desc() {
		return part_desc;
	}

	public void setPart_desc(String part_desc) {
		this.part_desc = part_desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void accept() //using if else inside accept() to handle negative price or quantity
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter part id: ");
		this.part_id = sc.next();
		System.out.println("Enter description of the part required: ");
		this.part_desc = sc.next();
		System.out.println("Enter price of the part: ");
		this.price = sc.nextDouble();
		if(this.price < 0)
		{
			this.setPrice(0);
		}
		System.out.println("Enter required quantity: ");
		if(this.quantity < 0)
		{
			this.setQuantity(0);
		}
		this.quantity = sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("Part id: "+this.part_id);
		System.out.println("Part description: "+this.part_desc);
		System.out.println("Part price: "+this.price);
		System.out.println("Quantity: "+this.quantity);
	}
	
	public double calTotal()
	{
		double total = this.price * this.quantity;
		return total;
		
	}
	
}
