package assignment_polymorphism;

import java.util.Scanner;

public class OnSeason {
	int amount,discount=0;
	
	public int purchase()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the purchased amount Onseason");
		amount=s.nextInt();
		return amount;
	}
	
	public void discount()
	{
		purchase();
		discount=(amount*40/100);
		System.out.println("Discount ="+discount);
	}

}
