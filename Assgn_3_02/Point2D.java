package com.app.geometry;

import java.util.Scanner;

public class Point2D 
{
	String x_cord;
	String y_cord;
	
	public Point2D() 
	{
		
	}
	
	public Point2D(String x_cord, String y_cord) 
	{
		
		this.x_cord = x_cord;
		this.y_cord = y_cord;
	}
	
	
	
	public String getX_cord() {
		return x_cord;
	}



	public void setX_cord(String x_cord) {
		this.x_cord = x_cord;
	}



	public String getY_cord() {
		return y_cord;
	}



	public void setY_cord(String y_cord) {
		this.y_cord = y_cord;
	}



	public boolean  isEqual(String x, String y)
	{
		if(x == y)
			return true;
		else
			return false;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first point of co-ordinate: ");
		this.x_cord = sc.next();
		System.out.println("Enter second point of co-ordinate: ");
		this.y_cord = sc.next();
		
	}
	
	public double calculateDistance(String x, String y)
	{
		double x1 = Double.parseDouble(x);
		double y1 = Double.parseDouble(y);
		double a = Double.parseDouble(this.x_cord);
		double b = Double.parseDouble(this.y_cord);
		double d1 = x1-a;
		double d2 = y1-b;
		double d3 = Math.pow(d1, 2);
		double d4 = Math.pow(d2, 2);
		double d5 = Math.sqrt(d3+d4);
		return d5;
		
	}
	
	public boolean isEqual()
	{
		double x = Double.parseDouble(this.x_cord);
		double y = Double.parseDouble(this.y_cord);
		if(x==y)
			return true;
		else
			return false;
		
	}
	
}
//Add calculateDistance method to calculate distance between current point and specified point & 
//return the distance to the caller. 

//Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc. 
//Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points from 
//user (Scanner) --to create 2 points (p1 & p2) 
//Use getDetails method to display point details.(p1's details & p2's details) 
//Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same position) 
//If they are not located at the same position , display distance between p1 & p2


//The formula to find the distance between the two points is usually given by d=√((x2 – x1)² + (y2 – y1)²)
//. This formula is used to find the distance between any two points on a coordinate plane or x-y plane