package assignment_inheritance;

import java.util.Scanner;

public class Employee_basic {
	int basic_pay;
	int deductions;
	int bonus;
	
	public void getdata()
	{
	Scanner s=new Scanner(System.in);;
	System.out.println("Enter basic pay");
	basic_pay=s.nextInt();
	System.out.println("Enter deductions");
	deductions=s.nextInt();
	System.out.println("Enter bonus");
	bonus=s.nextInt();
	}
}
