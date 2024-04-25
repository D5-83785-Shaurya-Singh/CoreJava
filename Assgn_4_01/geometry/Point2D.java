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


	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first point of co-ordinate: ");
		this.x_cord = sc.next();
		System.out.println("Enter second point of co-ordinate: ");
		this.y_cord = sc.next();
		
	}
	
	public boolean isEqual(String x, String y)
	{
		double a = Double.parseDouble(this.x_cord);
		double b = Double.parseDouble(this.y_cord);
		double x1 = Double.parseDouble(this.x_cord);
		double y1 = Double.parseDouble(this.y_cord);
		if(a == x1 && b == y1)
			return true;
		else
			return false;
		
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
	
	
	
}
