package p1;

import java.util.Comparator;
import java.util.Scanner;

public class Student implements Comparable<Student>
{
	private int rollno;
	private String name;
	private int marks;
	private String course;
	
	
	public Student() 
	{
		super();
		
	}


	public Student(int rollno, String name, int marks, String course) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}
	
	public void accept()
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter student's roll no: ");
		this.rollno = sc.nextInt();
		System.out.println("Enter student's name: ");
		this.name = sc.next();
		System.out.println("Enter marks: ");
		this.marks = sc.nextInt();
		System.out.println("Enter course: ");
		this.course = sc.next();
	}
	
	
	@Override
	public String toString() 
	{
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}


	@Override
	public int compareTo(Student o) //based on natural ordering
	{
		return this.rollno - o.rollno;
	}
	
}


class Namecomparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		int a = o1.getName().compareToIgnoreCase(o2.getName()); 
		return a;
	}
	
}

class Markscomparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		int x = Integer.compare(o2.getMarks(), o1.getMarks());
		return x;
	}
	
}

class Coursecomparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		//int x = o1.getCourse().compareToIgnoreCase(o2.getCourse());
		int x = o1.getCourse().compareToIgnoreCase(o2.getCourse());
		return x;
	}
	
}


