package assignment_polymorphism;

import java.util.Scanner;

public class OffSeason extends OnSeason {
	int amount,discount=0;
	
	public int purchase()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the purchased amount Offseason");
		amount=s.nextInt();
		return amount;
	}
	
	public void discount()
	{
		purchase();
		discount=(amount*15/100);
		System.out.println("Discount ="+discount);
	}


	public static void main(String[] args) {
		
		OffSeason o=new OffSeason();
		o.discount();
		OnSeason n=new OnSeason();
		n.discount();
	}

}

