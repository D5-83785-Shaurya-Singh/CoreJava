package com.app.fruits;

import java.util.Scanner;

public class Fruit 
{
	String name;
	String color;
	double weight;
	boolean isFresh;
	
	
	public Fruit() 
	{
		
	}


	public Fruit(String name, String color, double weight, boolean isFresh) 
	{
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}
	
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public boolean isFresh() {
		return isFresh;
	}


	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}


	@Override
	public String toString() //string representation of an object
	{
		return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}


	public String taste()
	{
		return "no specific taste";
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fruit name: ");
		this.name = sc.next();
		System.out.println("Enter color: ");
		this.color = sc.next();
		System.out.println("Enter weight: ");
		this.weight = sc.nextDouble();
	}
	
	
}

/*
Q1 Apply inheritance n polymorphism 
a) Arrange Fruit,Apple,Orange,Mango in inheritance hierarchy 
b) Properties (instance variables)  : color : String , weight : double , name:String, isFresh : boolean 
c) Add suitable constructors. 
d) Override  toString correctly to return state of all fruits (including : name ,color , weight ) 
e) Add a taste() method : public String taste() 
For Fruit : it should return "no specific taste" 
Apple : should return  "sweet n sour" 
Mango : should return  "sweet" 
Orange : should return  "sour" 
f)  Add all of above classes under the package "com.app.fruits" 
g) Create java application FruitBasket , with main method , as a tester 
h) Prompt user for the basket size n create suitable data structure and give options
*/