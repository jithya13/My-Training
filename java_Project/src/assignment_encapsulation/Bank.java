package assignment_encapsulation;

import java.util.Scanner;
public class Bank {
	private int pin_number;
	int amount;
	public int getPin_number() {
		return pin_number;
	}
	public void validate_pin()
	{
		int x=getPin_number();
		if(x==1001 || x==1234 || x==1212)
		{
			System.out.println("Enter the amount to withdraw");
			Scanner s=new Scanner(System.in);
			 amount=s.nextInt();
			 System.out.println("Amount withdrawed is "+amount); 
		}
		else
		{
			System.out.println("Invalid pin number.Please try again");
		}
	}
	public void setPin_number(int pin_number) {
		this.pin_number = pin_number;
	}
	}


