package com.app.geometry;

import java.util.Scanner;

public class TestPointArray1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how many points you want to enter(for co-ordinates): ");
		int num = sc.nextInt();
		
		Point2D[] arr = new Point2D[num]; //array of references which will hold objects of type Point2D
		for(int i = 0; i < arr.length; i++)
		{
			String x,y;
			System.out.println("Please enter x co-ordinate: ");
			x = sc.next();
			System.out.println("Please enter y co-ordinate: ");
			y = sc.next();
			arr[i] = new Point2D(x,y);
		}
			
		
		int choice;
		do
		{
			System.out.println("Please enter choice: ");
			System.out.println("0. Exit");
			System.out.println("1. Enter a particular index value to display it's x and y co-ordinates: ");
			System.out.println("2. To display x and y co-ordinates of all points: ");
			System.out.println("3. To enter new co-ordinates: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter a particular index value to display it's co-ordinates: ");
				int a = sc.nextInt();
				if(a < 0 || a > arr.length-1)
				{
					System.out.println("Invalid index, please retry!!!");
				}
				else
				{
					System.out.println("Values of x and y co-ordinates for the specified index is: " + arr[a].x_cord + " " + arr[a].y_cord);
					
				}
				break;
			}
			
			case 2:
			{
				for(Point2D ele: arr)
				{
					System.out.println(ele.x_cord+" "+ele.y_cord);
				}
				
//				for(int i = 0; i < arr.length; i++)
//				{
//					System.out.println(arr[i].x_cord+" "+arr[i].y_cord);
//				}
				break;
			}
			
			case 3:
			{
				System.out.println("Enter value for x co-ordinate: ");
				String x = sc.next();
				System.out.println("Enter value for y co-ordinate: ");
				String y = sc.next();
				Point2D p1 = new Point2D(x,y);
				for(int i = 0; i < arr.length; i++)
				{
					//if(arr[i].x_cord == x && arr[i].y_cord == y)
					if((arr[i].x_cord.equals(x))&& (arr[i].y_cord.equals(y)))
					{
						System.out.println("Same position co-ordinates found at "+i+" index");
					}
					else
					{
						double d = arr[i].calculateDistance(x, y);
						System.out.println("Distance between the points is: "+d);
					}
				}
				
				break;
			}//end of case 3
			
			
			}//end of switch
			
		}while(choice != 0);//end of do while
		

	}//end of main()

}//end of class
