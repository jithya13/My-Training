package mulilevel_pack;

public class Car extends Vehicle {
	String brand ="Ford";
	public void car_display()
	{
		System.out.println("Brand="+brand);
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.display();
        c.car_display();
	}

}
