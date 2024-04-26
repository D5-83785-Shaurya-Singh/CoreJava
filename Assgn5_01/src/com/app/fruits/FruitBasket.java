package com.app.fruits;

import java.util.Arrays;
import java.util.Scanner;

public class FruitBasket 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***********Welcome to our store************");
		System.out.println("Available fruits are: \n 1.Mango \n 2.Orange \n 3.Apple ");
		System.out.println("How many fruits that you would want to purchase: ");
		int size = sc.nextInt();
		
		Fruit[] frr = new Fruit[size];
		
		int choice,count = 0;
		do
		{
			System.out.println(" 0. Exit\n 1. Add Mango\n 2. Add Orange\n 3. Add Apple \n 4.Display names of all fruits in your basket");
			System.out.println(" 5.Display names of all fresh fruits from fruit basket");
			System.out.println(" 6.Mark a particular fruit as stale");
			System.out.println(" 7.Display taste of all stale fruits in the basket ");
			
			
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				if(count < size)
				{
					frr[count++] = new Mango("Alphonso", "Yellow", 0.250, true);
					System.out.println("Mango added to your basket :-)");
				}
				else
					System.out.println("Your fruit basket is full!!");
				break;
			}
			case 2:
			{
				if(count < size)
				{
					frr[count++] = new Orange("Nagpur", "Orange", 0.130, false);
					System.out.println("Orange added to your basket :-)");
				}
				else
					System.out.println("Your fruit basket is full!!");
				break;
			}
			
			case 3:
			{
				if(count < size)
				{
					frr[count++] = new Apple("Fuji", "Red", 0.200, true);
					System.out.println("Apple added to your basket :-)");
				}
				else
					System.out.println("Your fruit basket is full!!");
				break;
			}
			
			case 4:
			{
				for(Fruit ele:frr)
				{
					if(ele == null)
					{
						System.out.println("Fruit not available!!");
					}	
					else
					{
						String s = ele.getName();
						System.out.println(s);
					}
				}
				break;
			}
			
			case 5:
			{
				for(Fruit ele: frr)
				{
					if(ele.isFresh)
					{
						System.out.println(ele);
					}
				}
				break;
			}
			
			case 6:
			{
				//boolean[] arr = new boolean[size];
				//Arrays.fill(arr, true);
				
				System.out.println("If you find the below listed fruits as stale, mark them as not fresh");
				for(Fruit ele: frr)
				{
					int i = 0;
					if(ele.isFresh)
					{
						String s = ele.getName();
						System.out.println(s);
						System.out.println("Enter true if it is fresh");
						System.out.println("Enter false if it is stale");
						boolean b1 = sc.nextBoolean();
						if(b1 == false)
						{
							ele.setFresh(false);
						}
						
						
					}
				}
				break;
			}
			
			case 7:
			{
				for(Fruit ele: frr)
				{
					if(!(ele.isFresh))
					{
						System.out.println(ele);
					}
				}
				break;
			}
			
//			case 8:
//			{
//				for(Fruit ele: frr)
//				{
//					String s = "sour";
//					if(s.equals(ele.taste()))
//					{
//						
//					}
//				}
//			}
				
			}
			
			
		}while(choice != 0);

	}

}


