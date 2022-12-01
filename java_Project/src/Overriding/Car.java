package Overriding;

public class Car extends Vehicle{
	
	void display()
	{
		System.out.println("Print Car");
	}
	
	public static void main(String[] args) 
	{
	Car c= new Car();
     c.display();
     
    Vehicle v= new Vehicle();
    v.display();
	}

}
