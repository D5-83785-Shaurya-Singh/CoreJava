package p1;

import java.util.*;


public class Tester 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> AL = new ArrayList<Student>();
		Student[] std = new Student[10];
		int count = 0;
		int choice;
		
		do
		{
			System.out.println("0. Exit\n1. Add Student\n2. Display all students sorted on roll no\n3. Display all students sorted on name ");
			System.out.println("4. Display all students sorted on marks in desc order\n5. Display all students sorted on course");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				if(count <10)
				{
					std[count] = new Student();
					std[count].accept();
					AL.add(std[count]);
					count++;
				}
				else
				{
					System.out.println("Only 10 students are allowed!!");
				}
				break;
			}
			
			case 2:
			{
				Collections.sort(AL); //by default this will call comparable or sorting will take place based on natural ordering
				System.out.println("Sorting on the basis of natural ordering i.e, roll no");
				for(Student ele: AL)
				{
					System.out.println(ele);
				}
				break;
			}
			
			case 3:
			{
				Namecomparator n1 = new Namecomparator();
				Collections.sort(AL, n1); //here first parameter means list which needs to be sorted
										  //and second parameter means on the basis of what feature we want to sort
										  //AL is List and n1 is comparator object
										  //means on the basis of parameter passed, the sort() will identify which sort() to implement
				System.out.println("Sorting based on the names using comparator: ");
				for(Student ele: AL)
				{
					System.out.println(ele);
				}
				break;
			}
			
			case 4:
			{
				Markscomparator m1 = new Markscomparator();
				Collections.sort(AL, m1);
				System.out.println("Sorting students based on marks but in descending order: ");
				for(Student ele: AL)
				{
					System.out.println(ele);
				}
				break;
			}
			
			case 5:
			{
				Coursecomparator C1 = new Coursecomparator();
				Collections.sort(AL, C1);
				System.out.println("Sorting students based on course: ");
				for(Student ele: AL)
				{
					System.out.println(ele);
				}
			}
			}//end of switch
			
		}while(choice != 0);//end of do while

	}

}
