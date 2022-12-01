package sample_pgm;

import java.util.Scanner;

public class Methods {
	static int Length,Breadth;  //static variable
	int area;                   // instance variable
	
	public static void getdata() //static method
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Length");
		Length=s.nextInt();
		System.out.println("Enter Breadth");
		Breadth=s.nextInt();	
	}
	public void display()       //instance method
	{	
		System.out.println("Area="+Length*Breadth);
	}
	
	public static void main(String[] args) 
	{
		Methods m= new Methods();
		getdata();  //calling static method
        m.display(); //calling instance method
	}

}
