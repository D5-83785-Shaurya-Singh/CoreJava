package com.app.geometry;

public class TestPoint 
{

	public static void main(String[] args) 
	{
		Point2D obj1 = new Point2D();
		obj1.accept();
		double d1 = obj1.calculateDistance("4", "4");
		System.out.println(d1);
		
		boolean b1 = obj1.isEqual();
		System.out.println(b1);
	}

}
